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
import yfiles.lang.YObject

/**
 * This interface can be used to query [IPortCandidate]s for a specific existing [IEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider">Online Documentation</a>
 */
external interface IEdgeReconnectionPortCandidateProvider : YObject {
/**
 * Returns all source port candidates that may be used for the edge.
 * @param [context] The context for which the candidates should be provided.
 * @return An enumerable over all source port candidates that are associated with the current context edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-method-getSourcePortCandidates">Online Documentation</a>
 */
   fun getSourcePortCandidates( context: IInputModeContext ):IEnumerable<IPortCandidate>
/**
 * Returns all source port candidates that may be used for the edge.
 * @param [context] The context for which the candidates should be provided.
 * @return An enumerable over all target port candidates that are associated with the current context edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-method-getTargetPortCandidates">Online Documentation</a>
 */
   fun getTargetPortCandidates( context: IInputModeContext ):IEnumerable<IPortCandidate>

companion object : InterfaceMetadata<IEdgeReconnectionPortCandidateProvider> {
/**
 * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns a union of all [source port candidates][IPortCandidateProvider.getAllSourcePortCandidates] or [target port candidates][IPortCandidateProvider.getAllTargetPortCandidates], respectively, of nodes and edges in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23ALL_NODE_AND_EDGE_CANDIDATES">Online Documentation</a>
 */
 val ALL_NODE_AND_EDGE_CANDIDATES: IEdgeReconnectionPortCandidateProvider
/**
 * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns a union of all [source port candidates][IPortCandidateProvider.getAllSourcePortCandidates] or [target port candidates][IPortCandidateProvider.getAllTargetPortCandidates], respectively, of nodes in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23ALL_NODE_CANDIDATES">Online Documentation</a>
 */
 val ALL_NODE_CANDIDATES: IEdgeReconnectionPortCandidateProvider
/**
 * Creates an implementation of the [IEdgeReconnectionPortCandidateProvider] interface that returns the candidates provided by the source and target port's owner's [IPortCandidateProvider] implementations or the existing edge's port, if no such provider is registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReconnectionPortCandidateProvider%23IEdgeReconnectionPortCandidateProvider-defaultmethod-fromSourceAndTarget">Online Documentation</a>
 */
   fun fromSourceAndTarget( edge: IEdge ):IEdgeReconnectionPortCandidateProvider
}
}
