// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YOrientedRectangle
import yfiles.algorithms.YRectangle
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * [LabelLayoutBase] is the default implementation of the [ILabelLayout] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutBase">Online Documentation</a>
 * 
 * @constructor Creates a new [LabelLayoutBase] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutBase%23LabelLayoutBase-constructor-LabelLayoutBase">Online Documentation</a>
 */
external open class LabelLayoutBase  () : ILabelLayout {

/**
 * Sets the bounding box of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutBase%23boundingBox">Online Documentation</a>
 */
override var boundingBox: YRectangle
/**
 * Gets or sets the label model parameter that describes the position of this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutBase%23modelParameter">Online Documentation</a>
 */
override var modelParameter: ILabelModelParameter
/**
 * Sets the box of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutBase%23orientedBox">Online Documentation</a>
 */
override var orientedBox: YOrientedRectangle

companion object : ClassMetadata<LabelLayoutBase> {
}
}

inline fun LabelLayoutBase(
    block: LabelLayoutBase.() -> Unit
): LabelLayoutBase {
    return LabelLayoutBase()
        .apply(block)
}
