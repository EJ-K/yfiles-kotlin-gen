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
 * [DiscreteNodeLabelLayoutModel] allows placing labels at eight positions around a node and at nine positions inside the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DiscreteNodeLabelLayoutModel] using the given candidate mask and insets.
 * @param [candidateMask] the position mask that defines the allowed positions for a node label
 * @param [inset] the inset value that defines the internal label distance to the node's border
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-constructor-DiscreteNodeLabelLayoutModel(DiscreteNodeLabelPositions,number)">Online Documentation</a>
 * 
 * @property candidateMask
 * Gets the candidate mask which specifies the valid positions for node labels.
 * 
 * Default value - [DiscreteNodeLabelPositions.INTERNAL_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23candidateMask">Online Documentation</a>
 */
external open class DiscreteNodeLabelLayoutModel  (
open val candidateMask: DiscreteNodeLabelPositions,
 inset: Double  = definedExternally) : INodeLabelLayoutModel {
/**
 * Creates a new instance of [DiscreteNodeLabelLayoutModel] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-constructor-DiscreteNodeLabelLayoutModel()">Online Documentation</a>
 */
 constructor()

/**
 * Gets a model parameter that encodes the default position of this model's allowed node label positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
override val defaultParameter: ILabelModelParameter
/**
 * Gets or sets the distance between the label's bounding box and the node.
 * 
 * Default value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23distance">Online Documentation</a>
 */
open var distance: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
 override   fun createModelParameter( labelBounds: YOrientedRectangle ,
 nodeLayout: INodeLayout ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
 override   fun getLabelCandidates( labelLayout: INodeLabelLayout ,
 nodeLayout: INodeLayout ):YList<NodeLabelCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
 override   fun getLabelPlacement( labelSize: YDimension ,
 nodeLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle
/**
 * Returns the oriented box of the label for the given label position.
 * @param [labelSize] the size of the label that should be placed
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @param [position] the label position that is valid in this model
 * @return the oriented box of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-method-getLabelPlacementForPosition">Online Documentation</a>
 */
 open protected   fun getLabelPlacementForPosition( labelSize: YDimension ,
 nodeLayout: INodeLayout ,
 position: DiscreteNodeLabelPositions ):YOrientedRectangle
/**
 * Checks whether or not the given model parameter encodes a valid node label position for this model.
 * @param [parameter] the model parameter
 * @return `true` if the label position described by the given model parameter is allowed, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelLayoutModel%23DiscreteNodeLabelLayoutModel-method-isParameterValid">Online Documentation</a>
 */
 open   fun isParameterValid( parameter: ILabelModelParameter ):Boolean

companion object : ClassMetadata<DiscreteNodeLabelLayoutModel> {
}
}
