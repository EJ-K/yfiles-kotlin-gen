// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata

/**
 * Specifies the layout data for the [GenericPartitionGridStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GenericPartitionGridStageData] which helps configuring [GenericPartitionGridStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStageData%23GenericPartitionGridStageData-constructor-GenericPartitionGridStageData">Online Documentation</a>
 */
external open class GenericPartitionGridStageData  () : LayoutData {

/**
 * Gets or sets the [partitionGridData] that allows to configure the [PartitionGrid] for the layout stage.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStageData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets the collection of edges that should not be considered when calculating the sub-components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStageData%23splitEdges">Online Documentation</a>
 */
final var splitEdges: ItemCollection<IEdge>

companion object : ClassMetadata<GenericPartitionGridStageData> {
}
}

inline fun GenericPartitionGridStageData(
    block: GenericPartitionGridStageData.() -> Unit
): GenericPartitionGridStageData {
    return GenericPartitionGridStageData()
        .apply(block)
}
