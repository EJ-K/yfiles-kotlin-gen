// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.graph.IEdge
import yfiles.lang.InterfaceMetadata

/**
 * This interface can be used to query [IPortCandidate]s for a specific existing [IEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider">Online Documentation</a>
 */
external interface IEdgeReconnectionPortCandidateProvider  {
  /**
   * Returns all source port candidates that may be used for the edge.
   * @param [context] The context for which the candidates should be provided.
   * @return An enumerable over all source port candidates that are associated with the current context edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-method-getSourcePortCandidates">Online Documentation</a>
   */
  fun getSourcePortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Returns all source port candidates that may be used for the edge.
   * @param [context] The context for which the candidates should be provided.
   * @return An enumerable over all target port candidates that are associated with the current context edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-method-getTargetPortCandidates">Online Documentation</a>
   */
  fun getTargetPortCandidates(
    context: IInputModeContext,
  ): IEnumerable<IPortCandidate>

  
  companion object : InterfaceMetadata<IEdgeReconnectionPortCandidateProvider> {
    /**
     * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns a union of all [source port candidates][IPortCandidateProvider] or [target port candidates][IPortCandidateProvider], respectively, of nodes and edges in the graph.
     * @param [edge] The [IEdge] for which to generate a [IEdgeReconnectionPortCandidateProvider].
     * @return An [IEdgeReconnectionPortCandidateProvider] that aggregates all available source or target port candidates from both nodes and edges in the graph.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-defaultmethod-fromAllNodeAndEdgeCandidates">Online Documentation</a>
     */
    fun fromAllNodeAndEdgeCandidates(
      edge: IEdge,
    ): IEdgeReconnectionPortCandidateProvider
    
    /**
     * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns a union of all [source port candidates][IPortCandidateProvider] or [target port candidates][IPortCandidateProvider], respectively, of nodes in the graph.
     * @param [edge] The [IEdge] for which to generate a [IEdgeReconnectionPortCandidateProvider].
     * @return An [IEdgeReconnectionPortCandidateProvider] that aggregates all available source or target port candidates from nodes in the graph.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-defaultmethod-fromAllNodeCandidates">Online Documentation</a>
     */
    fun fromAllNodeCandidates(
      edge: IEdge,
    ): IEdgeReconnectionPortCandidateProvider
    
    /**
     * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns the candidates provided by the source and target port's owner's [IPortCandidateProvider] implementations or the existing edge's port, if no such provider is registered.
     * @param [edge] The [IEdge] for which to generate a [IEdgeReconnectionPortCandidateProvider].
     * @return An [IEdgeReconnectionPortCandidateProvider] that uses candidates from the source and target nodes' IPortCandidateProvider or falls back to the edge’s current ports if none are available.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-defaultmethod-fromSourceAndTarget">Online Documentation</a>
     */
    fun fromSourceAndTarget(
      edge: IEdge,
    ): IEdgeReconnectionPortCandidateProvider
  }
}
