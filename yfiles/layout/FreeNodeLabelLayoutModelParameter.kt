// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The model parameter that encodes a label position within [FreeNodeLabelLayoutModel].
 * @see [setPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModelParameter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FreeNodeLabelLayoutModelParameter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModelParameter%23FreeNodeLabelLayoutModelParameter-constructor-FreeNodeLabelLayoutModelParameter()">Online Documentation</a>
 */
external open class FreeNodeLabelLayoutModelParameter  () : YObject {
/**
 * Creates a new instance of [FreeNodeLabelLayoutModelParameter] with the given offset.
 * @param [dx] the horizontal offset
 * @param [dy] the vertical offset
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModelParameter%23FreeNodeLabelLayoutModelParameter-constructor-FreeNodeLabelLayoutModelParameter(number,number)">Online Documentation</a>
 */
 constructor( dx: Double ,
 dy: Double )

/**
 * Gets the offset of the label's center to the upper-left corner of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModelParameter%23point">Online Documentation</a>
 */
open val point: YPoint
/**
 * Specifies the offset of the label's center to the upper-left corner of the node.
 * @param [dx] the horizontal offset
 * @param [dy] the vertical offset
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModelParameter%23FreeNodeLabelLayoutModelParameter-method-setPoint">Online Documentation</a>
 */
 open   fun setPoint( dx: Double ,
 dy: Double )

companion object : ClassMetadata<FreeNodeLabelLayoutModelParameter> {
}
}
