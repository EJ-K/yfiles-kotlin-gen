// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import yfiles.algorithms.AbortHandler
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.IEdgeLabelLayoutModel
import yfiles.layout.INodeLabelLayoutModel
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies custom data for the [GenericLabeling].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [LabelingData] which helps configuring [GenericLabeling].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23LabelingData-constructor-LabelingData">Online Documentation</a>
 */
external open class LabelingData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of labels that shall be placed by the algorithm.
 * @see [LabelingBase.affectedLabelsDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23affectedLabels">Online Documentation</a>
 */
final var affectedLabels: DpKeyItemCollection<ILabel>
/**
 * Gets or sets the mapping from edge labels to an [IEdgeLabelLayoutModel] used by the labeling algorithm instead of the original label model.
 * @see [LabelingBase.LABEL_MODEL_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23edgeLabelModels">Online Documentation</a>
 */
final var edgeLabelModels: ItemMapping<ILabel, IEdgeLabelLayoutModel>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from node labels to an [INodeLabelLayoutModel] used by the labeling algorithm instead of the original label model.
 * @see [LabelingBase.LABEL_MODEL_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23nodeLabelModels">Online Documentation</a>
 */
final var nodeLabelModels: ItemMapping<ILabel, INodeLabelLayoutModel>
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<LabelingData> {
}
}

inline fun LabelingData(
    block: LabelingData.() -> Unit
): LabelingData {
    return LabelingData()
        .apply(block)
}
