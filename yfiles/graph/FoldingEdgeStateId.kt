// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A data holder that can be used to describe a [folding][IFoldingView.isInFoldingState] edge that connects to nodes inside a collapsed group or to other folder nodes in a [IFoldingView].
 * @see [FoldingManager.hasFoldingEdgeState]
 * @see [FoldingManager.getFoldingEdgeState]
 * @see [IFoldingView.isInFoldingState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId">Online Documentation</a>
 * 
 * @constructor Initializes an id for a folding edge in a [view][IFoldingView] that represent a master edge and connects a specific pair of nodes.
 * @param [masterEdge] An edge in the [FoldingManager.masterGraph] that is represented by the folding edge.
 * @param [currentMasterSource] The source node of the edge or one of its ancestors to which the folding edge connects in the view, if the actual parent is currently [collapsed in an ancestor node][IFoldingView.collapse].
 * @param [sourceIsCollapsed] `true` if the `currentMasterSource` is the true source of the `masterEdge`, but is in its [collapsed/dummy][IFoldingView.collapse] state.
 * @param [currentMasterTarget] The target node of the edge or one of its ancestors to which the folding edge connects in the view, if the actual parent is currently [collapsed in an ancestor node][IFoldingView.collapse].
 * @param [targetIsCollapsed] `true` if the `currentMasterTarget` is the true target of the `masterEdge`, but is in its [collapsed/dummy][IFoldingView.collapse] state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23FoldingEdgeStateId-constructor-FoldingEdgeStateId(IEdge,INode,boolean,INode,boolean)">Online Documentation</a>
 * 
 * @property masterEdge
 * Gets the edge instance in the [FoldingManager.masterGraph] that is represented by the folding edge in a view.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23masterEdge">Online Documentation</a>
 * 
 * @property currentMasterSource
 * Gets the source node of the edge or an ancestor (both in the [FoldingManager.masterGraph]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23currentMasterSource">Online Documentation</a>
 * 
 * @property sourceIsCollapsed
 * Gets whether the [currentMasterSource] node [is in folder state][IFoldingView.isInFoldingState].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23sourceIsCollapsed">Online Documentation</a>
 * 
 * @property currentMasterTarget
 * Gets the target node of the edge or an ancestor (both in the [FoldingManager.masterGraph]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23currentMasterTarget">Online Documentation</a>
 * 
 * @property targetIsCollapsed
 * Gets whether the [currentMasterTarget] node [is in folder state][IFoldingView.isInFoldingState].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23targetIsCollapsed">Online Documentation</a>
 */
external open class FoldingEdgeStateId  (
final val masterEdge: IEdge,
final val currentMasterSource: INode,
final val sourceIsCollapsed: Boolean,
final val currentMasterTarget: INode,
final val targetIsCollapsed: Boolean) : YObject {
/**
 * Initializes an id for a folding edge that is currently part of the given view.
 * @param [foldingView] The view the folding edge is part of.
 * @param [foldingEdge] The instance that is part of the [folding view graph][IFoldingView.graph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeStateId%23FoldingEdgeStateId-constructor-FoldingEdgeStateId(IFoldingView,IEdge)">Online Documentation</a>
 */
 constructor( foldingView: IFoldingView ,
 foldingEdge: IEdge )

companion object : ClassMetadata<FoldingEdgeStateId> {
}
}
