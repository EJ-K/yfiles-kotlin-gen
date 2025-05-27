// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [SnapOuterPortsToNodeBorderStage] moves edge ports that are outside the corresponding area of the nodes to their border.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapOuterPortsToNodeBorderStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SnapOuterPortsToNodeBorderStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapOuterPortsToNodeBorderStage%23SnapOuterPortsToNodeBorderStage-constructor-SnapOuterPortsToNodeBorderStage">Online Documentation</a>
 */
external open class SnapOuterPortsToNodeBorderStage  () : LayoutStageBase {

/**
 * Snaps all edge ports that lie outside the bounds of the nodes to their border.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapOuterPortsToNodeBorderStage%23SnapOuterPortsToNodeBorderStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<SnapOuterPortsToNodeBorderStage> {
}
}

inline fun SnapOuterPortsToNodeBorderStage(
    block: SnapOuterPortsToNodeBorderStage.() -> Unit
): SnapOuterPortsToNodeBorderStage {
    return SnapOuterPortsToNodeBorderStage()
        .apply(block)
}
