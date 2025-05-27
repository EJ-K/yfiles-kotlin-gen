// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.INode
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata

/**
 * A specialized [OrthogonalSnapLine] that stores a [node] as additional information that can be used for the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeBasedSnapLine">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeBasedSnapLine] class.
 * @param [node] The node to assign to [node].
 * @param [orientation] The orientation of the snap line. This is one of [SnapLineOrientation.HORIZONTAL] or [SnapLineOrientation.VERTICAL].
 * @param [snapType] The type of the line that describes how other items will snap to this line. This is one of [SnapLineSnapTypes.TOP], [SnapLineSnapTypes.BOTTOM], [SnapLineSnapTypes.LEFT], [SnapLineSnapTypes.RIGHT], or [SnapLineSnapTypes.CENTER].
 * @param [visualizationType] The type of the visual representation of this snap line.
 * @param [coordinates] The coordinates of the center point of the snap line.
 * @param [tag] A tag that is associated with this snap line - see [SnapLine.tag] for a typical use of this value.
 * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeBasedSnapLine%23NodeBasedSnapLine-constructor-NodeBasedSnapLine(INode,SnapLineOrientation,SnapLineSnapTypes,SnapLineVisualizationType,Point,Object,number)">Online Documentation</a>
 */
external open class NodeBasedSnapLine  ( node: INode ,
 orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 visualizationType: SnapLineVisualizationType ,
 coordinates: Point ,
 tag: Tag? ,
 weight: Double ) : OrthogonalSnapLine {
/**
 * Initializes a new instance of the [NodeBasedSnapLine] class.
 * @param [node] The node to assign to [node].
 * @param [orientation] The orientation of the snap line. This is one of [SnapLineOrientation.HORIZONTAL] or [SnapLineOrientation.VERTICAL].
 * @param [snapType] The type of the line that describes how other items will snap to this line. This is one of [SnapLineSnapTypes.TOP], [SnapLineSnapTypes.BOTTOM], [SnapLineSnapTypes.LEFT], [SnapLineSnapTypes.RIGHT], or [SnapLineSnapTypes.CENTER].
 * @param [visualizationType] The type of the visual representation of this snap line.
 * @param [coordinates] The coordinates of the center point of the snap line.
 * @param [from] The smaller value of the coordinate that delimits this snap line.
 * @param [to] The greater value of the coordinate that delimits this snap line.
 * @param [tag] A tag that is associated with this snap line - see [SnapLine.tag] for a typical use of this value.
 * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeBasedSnapLine%23NodeBasedSnapLine-constructor-NodeBasedSnapLine(INode,SnapLineOrientation,SnapLineSnapTypes,SnapLineVisualizationType,Point,number,number,Object,number)">Online Documentation</a>
 */
 constructor( node: INode ,
 orientation: SnapLineOrientation ,
 snapType: SnapLineSnapTypes ,
 visualizationType: SnapLineVisualizationType ,
 coordinates: Point ,
 from: Double ,
 to: Double ,
 tag: Tag? ,
 weight: Double )

/**
 * Gets the node that is associated with this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeBasedSnapLine%23node">Online Documentation</a>
 */
final val node: INode

companion object : ClassMetadata<NodeBasedSnapLine> {
}
}
