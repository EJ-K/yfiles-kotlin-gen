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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface defines the properties of the model associated with an [IEdgeLabelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayoutModel">Online Documentation</a>
 */
external interface IEdgeLabelLayoutModel : YObject {
/**
 * Gets a model parameter that encodes the default position of this model's allowed edge label positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
val defaultParameter: ILabelModelParameter
/**
 * Creates a model parameter that represents the given edge label position within this model.
 * @param [labelBounds] the oriented box of the label, encoding the label location for which the parameter should be created
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @return the model parameter representing the given label location
 * @see [getLabelPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayoutModel%23IEdgeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
   fun createModelParameter( labelBounds: YOrientedRectangle ,
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayoutModel%23IEdgeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
   fun getLabelCandidates( labelLayout: IEdgeLabelLayout ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ):YList<EdgeLabelCandidate>
/**
 * Returns the oriented box of the label for the position encoded by the given model parameter.
 * @param [labelSize] the width and height of the label
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the source node of the label-owning edge
 * @param [targetLayout] the layout of the target node of the label-owning edge
 * @param [parameter] the model parameter that describes the position of the label within this model
 * @return the oriented bounds of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayoutModel%23IEdgeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
   fun getLabelPlacement( labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle

companion object : InterfaceMetadata<IEdgeLabelLayoutModel> {
}
}
