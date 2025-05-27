// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * The interface of the factory that is passed to implementations of the [IFoldingEdgeConverter]'s [IFoldingEdgeConverter.addFoldingEdge] method.
 * @see [IFoldingEdgeConverter.addFoldingEdge]
 * @see [IFoldingEdgeConverter]
 * @see [FoldingManager.foldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeFactory">Online Documentation</a>
 */
external interface IFoldingEdgeFactory : YObject {
/**
 * Tells the [IFoldingView] implementation to add the edge provided to the [IFoldingEdgeConverter.addFoldingEdge] method as a separate folding edge to the view at the given ports.
 * @param [sourcePort] The source port at the source node in the view to use or `null` if an extra [folding state][IFoldingView.isInFoldingState] port should be added for the edge to connect to at the source.
 * @param [targetPort] The target port at the target node in the view to use or `null` if an extra [folding state][IFoldingView.isInFoldingState] port should be added for the edge to connect to at the target.
 * @return The folding edge that has been created in the view. Don't change the properties of the edge directly.
 * @see [IFoldingEdgeConverter]
 * @see [IFoldingView.getViewItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeFactory%23IFoldingEdgeFactory-method-addAsSeparateEdge">Online Documentation</a>
 */
   fun addAsSeparateEdge( sourcePort: IPort? ,
 targetPort: IPort? ):IEdge
/**
 * Tells the [IFoldingView] implementation to logically add the edge provided to the [IFoldingEdgeConverter.addFoldingEdge] method to a folding edge that already exists in the view.
 * @param [foldingEdge] One of the [existing folding edges][getExistingFoldingEdges] from the view which has been chosen to represent the master edge in this view.
 * @return The folding edge that represents the edge in the view, which is the same as the `foldingEdge` parameter. Don't change the properties of the edge directly.
 * @see [IFoldingEdgeConverter]
 * @see [getExistingFoldingEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeFactory%23IFoldingEdgeFactory-method-addToExistingFoldingEdge">Online Documentation</a>
 */
   fun addToExistingFoldingEdge( foldingEdge: IEdge ):IEdge
/**
 * Tells the [IFoldingView] implementation not to add a folding edge for the edge provided to the [IFoldingEdgeConverter.addFoldingEdge] method in this view.
 * @return This method will always return `null`. This is for symmetry reasons to be easily exchangeable with the other methods.
 * @see [IFoldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeFactory%23IFoldingEdgeFactory-method-excludeFoldingEdge">Online Documentation</a>
 */
   fun excludeFoldingEdge():IEdge?
/**
 * Helper methods that can be used by the implementation of the [IFoldingEdgeConverter.addFoldingEdge] method to determine the folding edges that are currently part of the view and interconnect the same nodes as the folding edge would, if it was included in the view.
 * @param [ignoreDirection] Whether the direction of the edges should be ignored so that reverse edges are included in the enumeration, too.
 * @return An collection of currently existing folding edges in the view that interconnects the same source and target node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeFactory%23IFoldingEdgeFactory-method-getExistingFoldingEdges">Online Documentation</a>
 */
   fun getExistingFoldingEdges( ignoreDirection: Boolean ):IEnumerable<IEdge>

companion object : InterfaceMetadata<IFoldingEdgeFactory> {
}
}
