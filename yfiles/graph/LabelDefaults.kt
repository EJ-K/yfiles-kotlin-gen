// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * A canonical implementation of the [ILabelDefaults] interface
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelDefaults] class using a trivial parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23LabelDefaults-constructor-LabelDefaults">Online Documentation</a>
 */
external open class LabelDefaults  () : ILabelDefaults {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23autoAdjustPreferredSize">Online Documentation</a>
 */
final override var autoAdjustPreferredSize: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23layoutParameter">Online Documentation</a>
 */
final override var layoutParameter: ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23shareLayoutParameterInstance">Online Documentation</a>
 */
final override var shareLayoutParameterInstance: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23shareStyleInstance">Online Documentation</a>
 */
final override var shareStyleInstance: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23style">Online Documentation</a>
 */
final override var style: ILabelStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23LabelDefaults-method-getLayoutParameterInstance">Online Documentation</a>
 */
 override   fun getLayoutParameterInstance( owner: ILabelOwner ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDefaults%23LabelDefaults-method-getStyleInstance">Online Documentation</a>
 */
 override   fun getStyleInstance( owner: ILabelOwner ):ILabelStyle

companion object : ClassMetadata<LabelDefaults> {
}
}

inline fun LabelDefaults(
    block: LabelDefaults.() -> Unit
): LabelDefaults {
    return LabelDefaults()
        .apply(block)
}
