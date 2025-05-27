// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This layout stage enables support for handling a graph with a [PartitionGrid][yfiles.layout.PartitionGrid] structure.
 * @see [PartitionGrid][yfiles.layout.PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicPartitionGridLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrganicPartitionGridLayoutStage] with the given layout algorithm as [core algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicPartitionGridLayoutStage%23OrganicPartitionGridLayoutStage-constructor-OrganicPartitionGridLayoutStage">Online Documentation</a>
 */
external open class OrganicPartitionGridLayoutStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Calculates the layout according to the [core layout algorithm][LayoutStageBase.coreLayout], while considering an existing [partition grid][yfiles.layout.PartitionGrid] structure defined for the graph.
 * @param [graph] the input graph
 * @throws InvalidGraphStructureError if the graph has group nodes whose content spans multiple grid cells or if the associated [group node mode data][OrganicLayout.GROUP_NODE_MODE_DP_KEY] is equal to [GroupNodeMode.FIX_CONTENTS] or [GroupNodeMode.FIX_BOUNDS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicPartitionGridLayoutStage%23OrganicPartitionGridLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<OrganicPartitionGridLayoutStage> {
}
}

inline fun OrganicPartitionGridLayoutStage(
    block: OrganicPartitionGridLayoutStage.() -> Unit
): OrganicPartitionGridLayoutStage {
    return OrganicPartitionGridLayoutStage()
        .apply(block)
}
