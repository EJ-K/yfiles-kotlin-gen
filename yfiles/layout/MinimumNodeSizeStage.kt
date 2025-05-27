// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [MinimumNodeSizeStage] enforces a given minimum width/height of the nodes of a graph during the layout process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage">Online Documentation</a>
 * 
 * @constructor Creates a new [MinimumNodeSizeStage] instance using the given optional [coreLayout][LayoutStageBase] and minimum width and height for the nodes.
 * @param [coreLayout] The core layout routine. The default value is `null`.
 * @param [minimumWidth] The minimum width of nodes that should be enforced. The default value is `1.0`.
 * @param [minimumHeight] The minimum height of nodes that should be enforced. The default value is `1.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage%23MinimumNodeSizeStage-constructor-MinimumNodeSizeStage">Online Documentation</a>
 */
open external class MinimumNodeSizeStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
  minimumWidth: Double  = definedExternally,
  minimumHeight: Double  = definedExternally,
) : LayoutStageBase {
  /**
   * Resizes all nodes that are smaller than the specified minimum size to that minimum size, executes the [coreLayout][LayoutStageBase] and restores the original sizes afterwards.
   * @param [graph] The input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage%23MinimumNodeSizeStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  companion object : ClassMetadata<MinimumNodeSizeStage> {
  }
}

inline fun MinimumNodeSizeStage(
    block: MinimumNodeSizeStage.() -> Unit
): MinimumNodeSizeStage {
    return MinimumNodeSizeStage()
        .apply(block)
}
