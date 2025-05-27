// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.lang.ClassMetadata

/**
 * An [IFoldingEdgeConverter] implementation that prevents folding edges from appearing in the [view][IFoldingView].
 * @see [FoldingManager.foldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter">Online Documentation</a>
 */
external class ExcludingFoldingEdgeConverter  : IFoldingEdgeConverter {
  /**
   * Does not add folding edges to the folding view.
   * @param [converterContext] The [IFoldingEdgeConverterContext] implementation that needs to be called in order to communicate the results of this query.
   * @param [foldingView] The instance into which the folding edge is going to be inserted.
   * @param [masterEdge] The edge from the [masterGraph][FoldingManager] that needs to be represented by a folding edge. Note that you may not return this instance.
   * @param [source] The source node that belongs to the [IFoldingView] graph that will act as the local view node of the actual source node.
   * @param [sourceIsCollapsed] Determines whether the `source` is currently a folder node.
   * @param [target] The target node that belongs to the [IFoldingView] graph that will act as the local view node of the actual target node.
   * @param [targetIsCollapsed] Determines whether the `target` is currently a folder node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
   */
  override fun addFoldingEdge(
    converterContext: IFoldingEdgeConverterContext,
    foldingView: IFoldingView,
    masterEdge: IEdge,
    source: INode,
    sourceIsCollapsed: Boolean,
    target: INode,
    targetIsCollapsed: Boolean,
  )
  
  /**
   * Does nothing and should not normally be called by the view since all folding edges are excluded from it.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance shall be determined.
   * @param [masterEdges] The list of [master edges][IFoldingView], that the folding edge initially represents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-initializeFoldingEdgeState">Online Documentation</a>
   */
  override fun initializeFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Does nothing and should not normally be called by the view since all folding edges are excluded from it.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance might need an update.
   * @param [masterEdges] The list of [master edges][IFoldingView], that the folding edge currently represents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-updateFoldingEdgeState">Online Documentation</a>
   */
  override fun updateFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Does nothing and should not normally be called by the view since all folding edges are excluded from it.
   * @param [state] The state to synchronize with the master edges.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [masterEdges] The edges in the [masterGraph][FoldingManager] to update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-updateMasterEdges">Online Documentation</a>
   */
  override fun updateMasterEdges(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  companion object : ClassMetadata<ExcludingFoldingEdgeConverter> {
  }
}
