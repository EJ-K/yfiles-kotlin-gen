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
 * [INodeLabelLayoutModel] defines the properties of the model associated with a [INodeLabelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutModel">Online Documentation</a>
 */
external interface INodeLabelLayoutModel : YObject {
/**
 * Gets a model parameter that encodes the default position of this model's allowed node label positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
val defaultParameter: ILabelModelParameter
/**
 * Creates a model parameter that represents the given node label position within this model.
 * @param [labelBounds] the box of the label, encoding the label location for which the parameter should be created
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @return the model parameter representing the given label location
 * @see [getLabelPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutModel%23INodeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
   fun createModelParameter( labelBounds: YOrientedRectangle ,
 nodeLayout: INodeLayout ):ILabelModelParameter
/**
 * Returns all [NodeLabelCandidate]s that describe valid label positions within this model.
 * @param [labelLayout] the label for which candidates should be generated
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @return a list of [NodeLabelCandidate] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutModel%23INodeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
   fun getLabelCandidates( labelLayout: INodeLabelLayout ,
 nodeLayout: INodeLayout ):YList<NodeLabelCandidate>
/**
 * Returns the bounds of the label for the position encoded by the given model parameter.
 * @param [labelSize] the width and height of the label
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @param [parameter] the model parameter that describes the position of the label within this model
 * @return the oriented box of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayoutModel%23INodeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
   fun getLabelPlacement( labelSize: YDimension ,
 nodeLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle

companion object : InterfaceMetadata<INodeLabelLayoutModel> {
}
}
