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
import yfiles.lang.ClassMetadata

/**
 * An [IFoldingEdgeConverter] implementation that prevents folding edges from appearing in the [view][IFoldingView].
 * @see [FoldingManager.foldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter">Online Documentation</a>
 */
external open class ExcludingFoldingEdgeConverter  : IFoldingEdgeConverter {

/**
 * Always calls [IFoldingEdgeFactory.excludeFoldingEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
 */
 override   fun addFoldingEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 source: INode ,
 sourceIsCollapsed: Boolean ,
 target: INode ,
 targetIsCollapsed: Boolean ):IEdge?
/**
 * Does nothing and should not normally be called by the view since all folding edges are excluded from it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-initializeFoldingEdgeState">Online Documentation</a>
 */
 override   fun initializeFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Does nothing and should not normally be called by the view since all folding edges are excluded from it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExcludingFoldingEdgeConverter%23ExcludingFoldingEdgeConverter-method-updateFoldingEdgeState">Online Documentation</a>
 */
 override   fun updateFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )

companion object : ClassMetadata<ExcludingFoldingEdgeConverter> {
}
}
