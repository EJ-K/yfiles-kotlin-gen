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
import yfiles.layout.BasicPortData
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [OrganicEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23OrganicEdgeRouterData-constructor-OrganicEdgeRouterData">Online Documentation</a>
 */
external class OrganicEdgeRouterData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the subset of edges that are in scope for the [OrganicEdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23scope">Online Documentation</a>
   */
  final val scope: EdgeScopeData<TNode, TEdge, TNodeLabel, TEdgeLabel, Boolean>
  
  companion object : ClassMetadata<OrganicEdgeRouterData<*, *, *, *>> {
  }
}
