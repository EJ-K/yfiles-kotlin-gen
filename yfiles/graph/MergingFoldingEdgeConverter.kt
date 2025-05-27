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
 * An [IFoldingEdgeConverter] implementation that makes the [view][IFoldingView] contain at most one folding edge between each pair of nodes by letting a single folding edge represent all master edges.
 * @see [FoldingManager.foldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-constructor-MergingFoldingEdgeConverter">Online Documentation</a>
 */
open external class MergingFoldingEdgeConverter () : IFoldingEdgeConverter {
  /**
   * Gets or sets the defaults to apply to folding edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23foldingEdgeDefaults">Online Documentation</a>
   */
  final var foldingEdgeDefaults: FoldingEdgeDefaults
  
  /**
   * Gets or sets a value indicating whether edge direction should be ignored for the determination of the [folding edges that are currently part of the graph][IFoldingEdgeConverterContext] .
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23ignoreEdgeDirection">Online Documentation</a>
   */
  final var ignoreEdgeDirection: Boolean
  
  /**
   * Adds the first separate edge to the source and target node pair using the [addAsSeparateEdge][IFoldingEdgeConverterContext] method.
   * @param [converterContext] The context providing methods for edge conversion.
   * @param [foldingView] The folding view in which the edges reside.
   * @param [masterEdge] The master edge to be represented.
   * @param [viewSourceNode] The view's source node.
   * @param [sourceIsCollapsed] Indicates whether the source node is collapsed.
   * @param [viewTargetNode] The view's target node.
   * @param [targetIsCollapsed] Indicates whether the target node is collapsed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-addFirstSeparateEdge">Online Documentation</a>
   */
  protected open fun addFirstSeparateEdge(
    converterContext: IFoldingEdgeConverterContext,
    foldingView: IFoldingView,
    masterEdge: IEdge,
    viewSourceNode: INode,
    sourceIsCollapsed: Boolean,
    viewTargetNode: INode,
    targetIsCollapsed: Boolean,
  )
  
  /**
   * Tries to add the folding edge to an [existing][IFoldingEdgeConverterContext] folding edge, considering the [ignoreEdgeDirection][MergingFoldingEdgeConverter] property.
   * @param [converterContext] The context providing methods for edge conversion.
   * @param [foldingView] The folding view in which the edges reside.
   * @param [masterEdge] The master edge to be represented.
   * @param [source] The source node of the edge.
   * @param [sourceIsCollapsed] Indicates whether the source node is collapsed.
   * @param [target] The target node of the edge.
   * @param [targetIsCollapsed] Indicates whether the target node is collapsed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
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
   * Initializes the folding edge appearance.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance shall be determined.
   * @param [masterEdges] The list of [getMasterEdges][IFoldingView]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-initializeFoldingEdgeState">Online Documentation</a>
   */
  override fun initializeFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Updates the folding edge appearance.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance might need an update.
   * @param [masterEdges] The list of [master edges][IFoldingView], that the folding edge currently represents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-updateFoldingEdgeState">Online Documentation</a>
   */
  override fun updateFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Callback to optionally back propagate state changes on a folding edge's [state][FoldingEdgeState] to the `masterEdges`.
   * @param [state] The state to synchronize with the master edges.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [masterEdges] The edges in the [masterGraph][FoldingManager] to update.
   * @see [IFoldingView.updateMasterEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-updateMasterEdges">Online Documentation</a>
   */
  override fun updateMasterEdges(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  companion object : ClassMetadata<MergingFoldingEdgeConverter> {
  }
}

inline fun MergingFoldingEdgeConverter(
    block: MergingFoldingEdgeConverter.() -> Unit
): MergingFoldingEdgeConverter {
    return MergingFoldingEdgeConverter()
        .apply(block)
}
