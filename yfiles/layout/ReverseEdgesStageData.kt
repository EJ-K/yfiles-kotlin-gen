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
import yfiles.lang.Id

/**
 * Specifies custom data for the [ReverseEdgesStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ReverseEdgesStageData] which helps configuring [ReverseEdgesStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23ReverseEdgesStageData-constructor-ReverseEdgesStageData">Online Documentation</a>
 */
external open class ReverseEdgesStageData  () : LayoutData {

/**
 * Gets or sets the collection of affected edges.
 * @see [ReverseEdgesStage.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: ItemCollection<IEdge>
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<ReverseEdgesStageData> {
}
}

inline fun ReverseEdgesStageData(
    block: ReverseEdgesStageData.() -> Unit
): ReverseEdgesStageData {
    return ReverseEdgesStageData()
        .apply(block)
}
