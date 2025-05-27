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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [FixGroupLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FixGroupLayoutData] which helps configuring [FixGroupLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutData%23FixGroupLayoutData-constructor-FixGroupLayoutData">Online Documentation</a>
 */
external open class FixGroupLayoutData  () : LayoutData {

/**
 * Gets or sets the collection of group nodes whose contents should keep their relative positions.
 * @see [FixGroupLayoutStage.FIXED_GROUP_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutData%23fixedGroupNodes">Online Documentation</a>
 */
final var fixedGroupNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<FixGroupLayoutData> {
}
}

inline fun FixGroupLayoutData(
    block: FixGroupLayoutData.() -> Unit
): FixGroupLayoutData {
    return FixGroupLayoutData()
        .apply(block)
}
