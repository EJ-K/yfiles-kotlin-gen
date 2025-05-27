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
 * This model parameter encodes a label position within [FreeEdgeLabelLayoutModel].
 * @see [setPoint]
 * @see [angle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FreeEdgeLabelLayoutModelParameter] with radius `50` and angle `0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter%23FreeEdgeLabelLayoutModelParameter-constructor-FreeEdgeLabelLayoutModelParameter()">Online Documentation</a>
 */
external open class FreeEdgeLabelLayoutModelParameter  () : YObject {
/**
 * Creates a new instance of [FreeEdgeLabelLayoutModelParameter] with the given radius, angle and rotation angle.
 * @param [radius] the distance of the label from the source node of the underlying edge
 * @param [theta] the angle in radians between the first segment of the underlying edge and the imaginary line to the center of the label
 * @param [angle] the rotation angle of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter%23FreeEdgeLabelLayoutModelParameter-constructor-FreeEdgeLabelLayoutModelParameter(number,number,number)">Online Documentation</a>
 */
 constructor( radius: Double ,
 theta: Double ,
 angle: Double  = definedExternally)

/**
 * Gets or sets the rotation angle of the label that is placed using this model parameter.
 * 
 * Default value - `0`. The label is placed paraxial.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Gets a point that represents the location of the label's center in relation to the source point of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter%23point">Online Documentation</a>
 */
open val point: YPoint
/**
 * Specifies a point that represents the location of the label's center in relation to the source point of the edge.
 * @param [radius] the distance to the source point
 * @param [theta] the location on the radius
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModelParameter%23FreeEdgeLabelLayoutModelParameter-method-setPoint">Online Documentation</a>
 */
 open   fun setPoint( radius: Double ,
 theta: Double )

companion object : ClassMetadata<FreeEdgeLabelLayoutModelParameter> {
}
}
