// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YDimension
import yfiles.algorithms.YList
import yfiles.algorithms.YOrientedRectangle
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * [SliderEdgeLabelLayoutModel] allows placement of labels at a set of continuous rotated positions along both sides of an edge or directly on the edge path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SliderEdgeLabelLayoutModel] with the given mode.
 * @param [mode] the slider mode
 * @see [mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23SliderEdgeLabelLayoutModel-constructor-SliderEdgeLabelLayoutModel">Online Documentation</a>
 * 
 * @property mode
 * Gets the model's slider mode which determines whether the label slides [on the edge][SliderMode.CENTER], [along both sides of the edge][SliderMode.SIDE] or [along one side of the edge][SliderMode.SINGLE_SIDE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23mode">Online Documentation</a>
 */
external open class SliderEdgeLabelLayoutModel  (
open val mode: SliderMode) : IEdgeLabelLayoutModel {

/**
 * Gets or sets the angle (measured in radians) of the label model.
 * 
 * Default value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Gets or sets whether or not edge labels get flipped if they would be upside down in their current position.
 * 
 * Default value - `false`. Edge labels keep their orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23autoFlipping">Online Documentation</a>
 */
open var autoFlipping: Boolean
/**
 * Gets or sets whether or not edge labels are automatically rotated according to the angle of the corresponding reference edge segment.
 * 
 * Default value - `true`. Labels are rotated with their edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23autoRotation">Online Documentation</a>
 */
open var autoRotation: Boolean
/**
 * Gets a model parameter that encodes the default position of this model's allowed edge label positions.
 * @see [mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
override val defaultParameter: ILabelModelParameter
/**
 * Gets or sets the distance between the label's box and the edge's path.
 * 
 * Default value - `5`
 * @see [distanceRelativeToEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23distance">Online Documentation</a>
 */
open var distance: Double
/**
 * Gets or sets whether or not the distance to the edge is interpreted relative to the edge's path.
 * 
 * Default value - `true`. The distance to the edge is interpreted relative to the edge's path.
 * @see [distance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23distanceRelativeToEdge">Online Documentation</a>
 */
open var distanceRelativeToEdge: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23SliderEdgeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
 override   fun createModelParameter( labelBounds: YOrientedRectangle ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):ILabelModelParameter
/**
 * Returns all [EdgeLabelCandidate]s that describe valid label positions within this model.
 * @param [labelLayout] the label for which candidates should be generated
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @return a list of [EdgeLabelCandidate] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23SliderEdgeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
 override   fun getLabelCandidates( labelLayout: IEdgeLabelLayout ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):YList<EdgeLabelCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SliderEdgeLabelLayoutModel%23SliderEdgeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
 override   fun getLabelPlacement( labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle

companion object : ClassMetadata<SliderEdgeLabelLayoutModel> {
}
}
