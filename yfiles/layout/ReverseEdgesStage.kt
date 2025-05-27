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
 * [ReverseEdgesStage] selectively reverses edges in a graph, while keeping the layout and label positions of the reversed edges as close to the pre-reversal layout and positions as possible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage">Online Documentation</a>
 * 
 * @constructor Creates a new [ReverseEdgesStage] instance with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm.
 * @see [LayoutStageBase.coreLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-constructor-ReverseEdgesStage">Online Documentation</a>
 */
open external class ReverseEdgesStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Reverses all *selected* edges before calling the [coreLayout][LayoutStageBase] and restores the original edge direction after the core layout algorithm has finished.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23ReverseEdgesStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  companion object : ClassMetadata<ReverseEdgesStage> {
    /**
     * A [data key][EdgeDataKey] for selecting edges for reversal.
     * @see [ReverseEdgesStageData.scope]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStage%23AFFECTED_EDGES_DATA_KEY">Online Documentation</a>
     */
     val AFFECTED_EDGES_DATA_KEY: EdgeDataKey<Boolean>
  }
}

inline fun ReverseEdgesStage(
    block: ReverseEdgesStage.() -> Unit
): ReverseEdgesStage {
    return ReverseEdgesStage()
        .apply(block)
}
