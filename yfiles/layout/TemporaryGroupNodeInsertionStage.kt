// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata

/**
 * [TemporaryGroupNodeInsertionStage] is useful if nodes should be treated by layout algorithms as if they were actually grouped without the need to manually create a grouped graph for the layout process.
 * @see [TEMPORARY_GROUP_DESCRIPTOR_DP_KEY]
 * @see [TemporaryGroupDescriptor]
 * @see [INSERTED_GROUP_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionStage">Online Documentation</a>
 * 
 * @constructor Creates a new [TemporaryGroupNodeInsertionStage] with the given layout algorithm as [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [core] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionStage%23TemporaryGroupNodeInsertionStage-constructor-TemporaryGroupNodeInsertionStage">Online Documentation</a>
 */
external open class TemporaryGroupNodeInsertionStage  ( core: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Creates temporary group nodes based on the sub-graphs define by the [temporary group descriptors][TEMPORARY_GROUP_DESCRIPTOR_DP_KEY], executes the core layout algorithm, and, finally, removes the temporary group nodes.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionStage%23TemporaryGroupNodeInsertionStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<TemporaryGroupNodeInsertionStage> {
/**
 * A data provider key that this stage uses for marking the inserted group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionStage%23INSERTED_GROUP_NODE_DP_KEY">Online Documentation</a>
 */
 val INSERTED_GROUP_NODE_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying temporary groups of the input graph.
 * @see [INSERTED_GROUP_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupNodeInsertionStage%23TEMPORARY_GROUP_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val TEMPORARY_GROUP_DESCRIPTOR_DP_KEY: NodeDpKey<TemporaryGroupDescriptor>
}
}

inline fun TemporaryGroupNodeInsertionStage(
    block: TemporaryGroupNodeInsertionStage.() -> Unit
): TemporaryGroupNodeInsertionStage {
    return TemporaryGroupNodeInsertionStage()
        .apply(block)
}
