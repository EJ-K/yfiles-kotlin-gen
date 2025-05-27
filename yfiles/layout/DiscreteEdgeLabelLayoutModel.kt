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
 * [DiscreteEdgeLabelLayoutModel] describes the placement of rotated labels at some predefined positions along the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DiscreteEdgeLabelLayoutModel] using the given candidate mask.
 * @param [candidateMask] the position mask that defines the allowed positions for an edge label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-constructor-DiscreteEdgeLabelLayoutModel(DiscreteEdgeLabelPositions)">Online Documentation</a>
 * 
 * @property candidateMask
 * Gets the candidate mask which specifies the valid positions for edge labels.
 * 
 * Default value - [DiscreteEdgeLabelPositions.SIX_POS]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23candidateMask">Online Documentation</a>
 */
external open class DiscreteEdgeLabelLayoutModel  (
open val candidateMask: DiscreteEdgeLabelPositions = definedExternally) : IEdgeLabelLayoutModel {

/**
 * Gets or sets the angle (measured in radians) of the label model.
 * 
 * Default value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Gets or sets whether or not edge labels get flipped if they would be upside down in their current position.
 * 
 * Default value - `false`. Edge labels keep their orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23autoFlipping">Online Documentation</a>
 */
open var autoFlipping: Boolean
/**
 * Gets or sets whether or not edge labels are automatically rotated according to the angle of the corresponding reference edge segment.
 * 
 * Default value - `true`. Labels are rotated with their edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23autoRotation">Online Documentation</a>
 */
open var autoRotation: Boolean
/**
 * Gets a model parameter that encodes the default position of this model's allowed edge label positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
override val defaultParameter: ILabelModelParameter
/**
 * Gets or sets the distance between the label's bounding box and the edge path.
 * 
 * Default value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23distance">Online Documentation</a>
 */
open var distance: Double
/**
 * Gets or sets whether or not the label position mask should be interpreted relative to the edge segment.
 * 
 * Default value - `false`. Positions are interpreted geometrically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23positionRelativeToSegment">Online Documentation</a>
 */
open var positionRelativeToSegment: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
 override   fun createModelParameter( labelBounds: YOrientedRectangle ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
 override   fun getLabelCandidates( labelLayout: IEdgeLabelLayout ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):YList<EdgeLabelCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
 override   fun getLabelPlacement( labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle
/**
 * Returns the oriented box of the label for the given label position.
 * @param [labelSize] the size of the label that should be placed
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @param [position] the label position that is valid in this model
 * @return the oriented box of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-getLabelPlacementForPosition">Online Documentation</a>
 */
 open protected   fun getLabelPlacementForPosition( labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 position: DiscreteEdgeLabelPositions ):YOrientedRectangle
/**
 * Checks whether or not the given model parameter encodes a valid edge label position for this model.
 * @param [parameter] the model parameter
 * @return `true` if the label position described by the given model parameter is allowed, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-isParameterValid">Online Documentation</a>
 */
 open   fun isParameterValid( parameter: ILabelModelParameter ):Boolean

companion object : ClassMetadata<DiscreteEdgeLabelLayoutModel> {
/**
 * Returns a model parameter that encodes the specified position.
 * @param [position] one of the valid positions
 * @return a model parameter that encodes the specified position
 * @throws ArgumentError if the specified position is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-createPositionParameter">Online Documentation</a>
 */
 final   fun createPositionParameter( position: DiscreteEdgeLabelPositions ):ILabelModelParameter
/**
 * Returns the position specifier that is encoded by the given model parameter.
 * @param [parameter] the model parameter
 * @return the position specifier
 * @throws ArgumentError if the specified model parameter is not valid for this model
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelLayoutModel%23DiscreteEdgeLabelLayoutModel-method-getPosition">Online Documentation</a>
 */
 final   fun getPosition( parameter: ILabelModelParameter ):DiscreteEdgeLabelPositions
}
}

inline fun DiscreteEdgeLabelLayoutModel(
    block: DiscreteEdgeLabelLayoutModel.() -> Unit
): DiscreteEdgeLabelLayoutModel {
    return DiscreteEdgeLabelLayoutModel()
        .apply(block)
}
