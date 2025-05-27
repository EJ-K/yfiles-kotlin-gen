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
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata

/**
 * An implementation of a [IHandleProvider] that can be used for [IEdge]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortRelocationHandleProvider] class using the given graph and edge.
 * @param [graph] The graph or null. If the graph is null, the handles will try to receive the graph from the [IInputModeContext] it is used in.
 * @param [edge] The edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23PortRelocationHandleProvider-constructor-PortRelocationHandleProvider">Online Documentation</a>
 */
external open class PortRelocationHandleProvider  ( graph: IGraph? ,
 edge: IEdge ) : IHandleProvider, IEdgePortHandleProvider {

/**
 * The edge this provider is working on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23edge">Online Documentation</a>
 */
protected final val edge: IEdge
/**
 * The graph this provider is working on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23graph">Online Documentation</a>
 */
protected final val graph: IGraph
/**
 * Gets or sets the maximum distance the pointer may be away of a candidate in order to be snapped to the candidate.
 * @see [PortRelocationHandle.maximumSnapDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23maximumSnapDistance">Online Documentation</a>
 */
final var maximumSnapDistance: Double
/**
 * Gets or sets a value indicating whether to show the candidates of hit [IPortOwner][yfiles.graph.IPortOwner]s only.
 * @see [PortRelocationHandle.showHitPortOwnerCandidatesOnly]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23showHitPortOwnerCandidatesOnly">Online Documentation</a>
 */
final var showHitPortOwnerCandidatesOnly: Boolean
/**
 * Gets or sets a value indicating whether to show port candidates.
 * @see [PortRelocationHandle.showPortCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23showPortCandidates">Online Documentation</a>
 */
final var showPortCandidates: Boolean
/**
 * Gets or sets whether the owner of the current [IPortCandidate] should be highlighted.
 * 
 * The default is `true`.
 * @see [PortRelocationHandle.showTargetHighlight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23showTargetHighlight">Online Documentation</a>
 */
final var showTargetHighlight: Boolean
/**
 * Gets or sets how the changed edge should be shown during the gesture.
 * @see [PortRelocationHandle.visualization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23visualization">Online Documentation</a>
 */
final var visualization: Visualization
/**
 * Factory method that creates the handle for this provider.
 * @param [graph] The graph that contains the edge.
 * @param [edge] The edge.
 * @param [sourcePort] if set to `true` the handle for the source port is sought.
 * @return A handle or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23PortRelocationHandleProvider-method-createPortRelocationHandle">Online Documentation</a>
 */
 open protected   fun createPortRelocationHandle( graph: IGraph? ,
 edge: IEdge ,
 sourcePort: Boolean ):IHandle?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23PortRelocationHandleProvider-method-getHandle">Online Documentation</a>
 */
 final override   fun getHandle( context: IInputModeContext ,
 edge: IEdge ,
 sourceHandle: Boolean ):IHandle?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandleProvider%23PortRelocationHandleProvider-method-getHandles">Online Documentation</a>
 */
 override   fun getHandles( context: IInputModeContext ):IEnumerable<IHandle>

companion object : ClassMetadata<PortRelocationHandleProvider> {
}
}
