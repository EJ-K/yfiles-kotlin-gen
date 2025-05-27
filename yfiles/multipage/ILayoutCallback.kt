// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Callback that is invoked when a [MultiPageLayout] has calculated a new multi-page layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutCallback">Online Documentation</a>
 */
external interface ILayoutCallback : YObject {
/**
 * Invoked from [MultiPageLayout.applyLayout] when a new multi-page layout has been calculated.
 * @param [result] the result of the layout calculation
 * @see [MultiPageLayout.applyLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutCallback%23ILayoutCallback-method-layoutDone">Online Documentation</a>
 */
   fun layoutDone( result: MultiPageLayoutResult )

companion object : InterfaceMetadata<ILayoutCallback> {

/**
 * Creates an implementation of the interface [ILayoutCallback] by using the given function as implementation for its [layoutDone] method.
 * @param [layoutDone] A function for [ILayoutCallback]'s single abstract method [layoutDone].
 * @return An instance of the [ILayoutCallback] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutCallback%23ILayoutCallback-method-create">Online Documentation</a>
 */
@JsName("create")
operator fun  invoke(
    layoutDone: (
result: MultiPageLayoutResult
) -> Unit 
):ILayoutCallback
}
}
