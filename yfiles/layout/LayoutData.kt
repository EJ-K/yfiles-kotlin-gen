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
 * Abstract base class for classes that specify custom data for a layout calculation on [IGraph][yfiles.graph.IGraph] or [LayoutGraph] instances.
 * @see [LayoutExecutor.layoutData]
 * @see [IGraph.applyLayout][yfiles.graph.IGraph.applyLayout]
 * @see [GraphComponent.applyLayoutAnimated][yfiles.view.GraphComponent.applyLayoutAnimated]
 * @see [GenericLayoutData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutData">Online Documentation</a>
 */
abstract external class LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>   {
  /**
   * Combines this instance with the given layout data.
   * @param [data] The [LayoutData] to combine this instance with.
   * @return The combined layout data.
   * @see [CompositeLayoutData]
   * @see [GenericLayoutData]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutData%23LayoutData-method-combineWith">Online Documentation</a>
   */
  fun combineWith(
    vararg data: LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>,
  ): LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  companion object : ClassMetadata<LayoutData<*, *, *, *>> {
  }
}
