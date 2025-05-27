// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IList
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface used by [FoldingManager] and [IFoldingView] which is responsible for managing edges between folder nodes.
 * @see [DefaultFoldingEdgeConverter]
 * @see [FoldingManager.foldingEdgeConverter]
 * @see [FoldingEdgeStateId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter">Online Documentation</a>
 */
external interface IFoldingEdgeConverter : YObject {
/**
 * This method gets called by the [IFoldingView] implementation to determine whether a given edge in the [FoldingManager.masterGraph] should be represented by a folding edge in the given view.
 * @param [factory] The [IFoldingEdgeFactory] implementation that needs to be called in order to communicate the results of this query.
 * @param [foldingView] The instance into which the folding edge is going to be inserted.
 * @param [masterEdge] The edge from the [FoldingManager.masterGraph] that needs to be represented by a folding edge. Note that you may not return this instance.
 * @param [source] The source node that belongs to the [IFoldingView] graph that will act as the local view node of the actual source node.
 * @param [sourceIsCollapsed] Determines whether the `source` is currently a folder node.
 * @param [target] The target node that belongs to the [IFoldingView] graph that will act as the local view node of the actual target node.
 * @param [targetIsCollapsed] Determines whether the `target` is currently a folder node.
 * @return The edge as returned by [IFoldingEdgeFactory.addAsSeparateEdge], or [IFoldingEdgeFactory.addToExistingFoldingEdge], or `null` if the edge will be [excluded][IFoldingEdgeFactory.excludeFoldingEdge] from the view.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
 */
   fun addFoldingEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 source: INode ,
 sourceIsCollapsed: Boolean ,
 target: INode ,
 targetIsCollapsed: Boolean ):IEdge?
/**
 * Triggered by the [view][IFoldingView] to initially create the appearance of a folding edge.
 * @param [state] The [FoldingEdgeState] of the edge to change.
 * @param [foldingView] The graph to which the folding edge belongs.
 * @param [foldingEdge] The folding edge for which the appearance shall be determined.
 * @param [masterEdges] The list of [master edges][IFoldingView.getMasterEdges], that the folding edge initially represents.
 * @see [updateFoldingEdgeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-initializeFoldingEdgeState">Online Documentation</a>
 */
   fun initializeFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Triggered by the [view][IFoldingView] to adjust the appearance of a folding edge
 * @param [state] The [FoldingEdgeState] of the edge to change.
 * @param [foldingView] The graph to which the folding edge belongs.
 * @param [foldingEdge] The folding edge for which the appearance might need an update.
 * @param [masterEdges] The list of [master edges][IFoldingView.getMasterEdges], that the folding edge currently represents.
 * @see [initializeFoldingEdgeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-updateFoldingEdgeState">Online Documentation</a>
 */
   fun updateFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )

companion object : InterfaceMetadata<IFoldingEdgeConverter> {
}
}
