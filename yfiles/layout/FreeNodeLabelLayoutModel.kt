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
 * [FreeNodeLabelLayoutModel] allows placing node labels at any desired position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel">Online Documentation</a>
 * 
 * @constructor Returns a new instance of [FreeNodeLabelLayoutModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel%23FreeNodeLabelLayoutModel-constructor-FreeNodeLabelLayoutModel">Online Documentation</a>
 */
external open class FreeNodeLabelLayoutModel  () : INodeLabelLayoutModel {

/**
 * Gets a model parameter that encodes the default position of [INodeLabelLayoutModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel%23defaultParameter">Online Documentation</a>
 */
override val defaultParameter: ILabelModelParameter
/**
 * Creates a model parameter that represents the given node label position within this model.
 * @param [labelBounds] the bounds of the label the parameter represents
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @return the model parameter
 * @throws ArgumentError if one or more of the given bounds' values are invalid, i.e., `NaN`
 * @see [getLabelPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel%23FreeNodeLabelLayoutModel-method-createModelParameter">Online Documentation</a>
 */
 override   fun createModelParameter( labelBounds: YOrientedRectangle ,
 nodeLayout: INodeLayout ):ILabelModelParameter
/**
 * Returns the [NodeLabelCandidate] that describes the current label position.
 * @param [labelLayout] the label for which candidates should be generated
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @return a list of [NodeLabelCandidate] instances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel%23FreeNodeLabelLayoutModel-method-getLabelCandidates">Online Documentation</a>
 */
 override   fun getLabelCandidates( labelLayout: INodeLabelLayout ,
 nodeLayout: INodeLayout ):YList<NodeLabelCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelLayoutModel%23FreeNodeLabelLayoutModel-method-getLabelPlacement">Online Documentation</a>
 */
 override   fun getLabelPlacement( labelSize: YDimension ,
 nodeLayout: INodeLayout ,
 parameter: ILabelModelParameter ):YOrientedRectangle

companion object : ClassMetadata<FreeNodeLabelLayoutModel> {
}
}
