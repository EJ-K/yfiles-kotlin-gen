// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.GeneralPath
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that is used to test whether a rendered item is deemed to be inside a lasso selection path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable">Online Documentation</a>
 */
external interface ILassoTestable : YObject {
/**
 * Returns `true` if the corresponding item is considered to intersect the given path.
 * @param [context] the current input mode context
 * @param [lassoPath] the path describing the lasso selection bounds
 * @return `true` if the item is considered to be captured by the lasso
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-method-isInPath">Online Documentation</a>
 */
   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean

companion object : InterfaceMetadata<ILassoTestable> {

/**
 * Creates an implementation of the interface [ILassoTestable] by using the given function as implementation for its [isInPath] method.
 * @param [isInPath] A function for [ILassoTestable]'s single abstract method [isInPath].
 * @return An instance of the [ILassoTestable] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILassoTestable%23ILassoTestable-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                isInPath: (
            context: IInputModeContext,
lassoPath: GeneralPath
            ) -> Boolean 
            ):ILassoTestable
}
}
