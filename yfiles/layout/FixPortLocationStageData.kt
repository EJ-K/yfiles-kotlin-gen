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
 * Specifies custom layout data for the [FixPortLocationStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FixPortLocationStageData] which helps configuring [FixPortLocationStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStageData%23FixPortLocationStageData-constructor-FixPortLocationStageData">Online Documentation</a>
 */
external open class FixPortLocationStageData  () : LayoutData {

/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStageData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStageData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<FixPortLocationStageData> {
}
}

inline fun FixPortLocationStageData(
    block: FixPortLocationStageData.() -> Unit
): FixPortLocationStageData {
    return FixPortLocationStageData()
        .apply(block)
}
