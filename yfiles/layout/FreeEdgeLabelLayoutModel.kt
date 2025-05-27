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
 * [FreeEdgeLabelLayoutModel] allows placing edge labels at any location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FreeEdgeLabelLayoutModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel%23FreeEdgeLabelLayoutModel-constructor-FreeEdgeLabelLayoutModel">Online Documentation</a>
 */
external open class FreeEdgeLabelLayoutModel  () : IEdgeLabelLayoutModel {

/**
 * Gets the model parameter that encodes the default position of [FreeEdgeLabelLayoutModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
override val defaultParameter: ILabelModelParameter
/**
 * Creates a model parameter that represents the given edge label position within this model.
 * @param [labelBounds] the oriented box of the label the parameter represents
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @return the model parameter representing the given label location
 * @throws ArgumentError if one or more of the given bounds' values are invalid, i.e., `NaN`
 * @see [getLabelPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel%23FreeEdgeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
 override   fun createModelParameter( labelBounds: YOrientedRectangle ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):ILabelModelParameter
/**
 * Returns the [EdgeLabelCandidate] that describes the current label position.
 * @param [labelLayout] the label for which candidates should be generated
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @return a list of [EdgeLabelCandidate] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel%23FreeEdgeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
 override   fun getLabelCandidates( labelLayout: IEdgeLabelLayout ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):YList<EdgeLabelCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeEdgeLabelLayoutModel%23FreeEdgeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
 override   fun getLabelPlacement( labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle

companion object : ClassMetadata<FreeEdgeLabelLayoutModel> {
}
}
