// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.PortConstraint

/**
 * Specifies custom data for the [StraightLineEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [StraightLineEdgeRouterData] which helps configuring [StraightLineEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData%23StraightLineEdgeRouterData-constructor-StraightLineEdgeRouterData">Online Documentation</a>
 */
external open class StraightLineEdgeRouterData  () : LayoutData {

/**
 * Gets or sets the collection of affected edges.
 * @see [StraightLineEdgeRouter.affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: DpKeyItemCollection<IEdge>
/**
 * Gets or sets the collection of affected nodes.
 * @see [StraightLineEdgeRouter.affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData%23affectedNodes">Online Documentation</a>
 */
final var affectedNodes: DpKeyItemCollection<INode>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouterData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<StraightLineEdgeRouterData> {
}
}

inline fun StraightLineEdgeRouterData(
    block: StraightLineEdgeRouterData.() -> Unit
): StraightLineEdgeRouterData {
    return StraightLineEdgeRouterData()
        .apply(block)
}
