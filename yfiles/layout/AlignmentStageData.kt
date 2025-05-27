// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.AbortHandler
import yfiles.geometry.IPoint
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [AlignmentStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [AlignmentStageData] which helps configuring [AlignmentStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23AlignmentStageData-constructor-AlignmentStageData">Online Documentation</a>
 */
external open class AlignmentStageData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the [partition grid][PartitionGrid] layout data which allows to define a grid that is respected by the [AlignmentStage] so that nodes that are not in the same column/row may not be aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets the mapping from nodes to the points relative to the center that are aligned.
 * @see [AlignmentStage.SNAP_OFFSET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23snapOffsets">Online Documentation</a>
 */
final var snapOffsets: ItemMapping<INode, IPoint>

companion object : ClassMetadata<AlignmentStageData> {
}
}

inline fun AlignmentStageData(
    block: AlignmentStageData.() -> Unit
): AlignmentStageData {
    return AlignmentStageData()
        .apply(block)
}
