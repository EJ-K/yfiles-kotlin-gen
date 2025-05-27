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
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.IPort
import yfiles.graph.IPortOwner
import yfiles.graph.SimpleEdge
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.view.CanvasComponent
import yfiles.view.Cursor
import yfiles.view.IObjectRenderer
import yfiles.view.PortCandidateRenderTag

/**
 * A sophisticated implementation of the [IHandle] interface that lets the user change an edge's [source][IEdge] and [targetPort][IEdge].
 * @see [getPortCandidates]
 * @see [EdgeDecorator.reconnectionPortCandidateProvider][yfiles.graph.EdgeDecorator.reconnectionPortCandidateProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [PortRelocationHandle] class.
 * @param [graph] The graph or `null`. If the graph instance is not specified, the handle will try to receive the graph from the [IInputModeContext] it is passed in during [initializeDrag][PortRelocationHandle].
 * @param [edge] The edge.
 * @param [sourceEnd] if set to `true` the source end will be subject to relocation, otherwise it will be the target port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-constructor-PortRelocationHandle">Online Documentation</a>
 * 
 * @property edge
 * Gets the edge this instance acts upon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23edge">Online Documentation</a>
 * 
 * @property sourceEnd
 * Gets a value indicating whether the source end of the edge is handled by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23sourceEnd">Online Documentation</a>
 */
open external class PortRelocationHandle (
graph: IGraph?,
protected final val edge: IEdge,
protected final val sourceEnd: Boolean) : IHandle {
  /**
   * Gets or sets a property that determines whether the existing port should be available as a possible port candidate, too.
   * 
   * The default is `true`.
   * If this property is set to `false`, [getPortCandidates][PortRelocationHandle] will return only the ports provided by the [IPortCandidateProvider] in the node's lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23addExistingPort">Online Documentation</a>
   */
  final var addExistingPort: Boolean
  
  /**
   * Gets or sets whether or not cyclic port dependencies are allowed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23allowCyclicPortDependencies">Online Documentation</a>
   */
  final var allowCyclicPortDependencies: Boolean
  
  /**
   * Gets or sets whether or not edges are allowed to connect to other edges.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23allowEdgeToEdgeConnections">Online Documentation</a>
   */
  final var allowEdgeToEdgeConnections: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23cursor">Online Documentation</a>
   */
  open override var cursor: Cursor
  
  /**
   * Gets a view of the location of the item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23location">Online Documentation</a>
   */
  open override val location: IPoint
  
  /**
   * Gets or sets the maximum distance the pointer may be away from a candidate in order to be snapped to the candidate.
   * @see [PortRelocationHandleProvider.maximumSnapDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23maximumSnapDistance">Online Documentation</a>
   */
  final var maximumSnapDistance: Double
  
  /**
   * Gets or sets the context to operate on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23parentInputModeContext">Online Documentation</a>
   */
  protected final var parentInputModeContext: IInputModeContext?
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes the [IPortCandidate]s.
   * @see [PortRelocationHandleProvider.portCandidateRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23portCandidateRenderer">Online Documentation</a>
   */
  final var portCandidateRenderer: IObjectRenderer<PortCandidateRenderTag>
  
  /**
   * Gets or sets the event recognizer that determines whether to resolve a [DYNAMIC][PortCandidateValidity] port candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23portCandidateResolutionRecognizer">Online Documentation</a>
   */
  final var portCandidateResolutionRecognizer: EventRecognizer
  
  /**
   * Gets the preview edge this instance uses during the edit.
   * @see [visualization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23previewEdge">Online Documentation</a>
   */
  protected final val previewEdge: SimpleEdge?
  
  /**
   * Gets or sets a value indicating whether a [DYNAMIC][PortCandidateValidity] port candidate should be resolved for the current mouse location.
   * @see [portCandidateResolutionRecognizer]
   * @see [resolveCandidate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23resolvePortCandidates">Online Documentation</a>
   */
  final var resolvePortCandidates: Boolean
  
  /**
   * Gets or sets a value indicating whether to show the candidates of hit [IPortOwner]s only.
   * @see [PortRelocationHandleProvider.showHitPortOwnerCandidatesOnly]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23showHitPortOwnerCandidatesOnly">Online Documentation</a>
   */
  final var showHitPortOwnerCandidatesOnly: Boolean
  
  /**
   * Gets or sets a value indicating whether to show port candidates.
   * @see [PortRelocationHandleProvider.showPortCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23showPortCandidates">Online Documentation</a>
   */
  final var showPortCandidates: Boolean
  
  /**
   * Gets or sets whether the owner of the current [IPortCandidate] should be highlighted.
   * 
   * The default is `true`.
   * @see [updateHighlight]
   * @see [PortRelocationHandleProvider.showTargetHighlight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23showTargetHighlight">Online Documentation</a>
   */
  final var showTargetHighlight: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23type">Online Documentation</a>
   */
  open override var type: HandleType
  
  /**
   * Gets or sets how the changed edge should be shown during the gesture.
   * @see [PortRelocationHandleProvider.visualization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23visualization">Online Documentation</a>
   */
  final var visualization: Visualization
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-cancelDrag">Online Documentation</a>
   */
  override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Factory method that creates the candidate for the existing port.
   * @param [port] The port to create a candidate for.
   * @return The candidate or `null`.
   * @see [getPortCandidates]
   * @see [addExistingPort]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-createExistingPortCandidate">Online Documentation</a>
   */
  protected open fun createExistingPortCandidate(
    port: IPort,
  ): IPortCandidate?
  
  /**
   * Factory method that creates the preview edge that will be shown during the drag operation.
   * @param [edge] The edge to be represented by the preview edge.
   * @return The preview edge instance to use.
   * @see [visualization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-createPreviewEdge">Online Documentation</a>
   */
  protected open fun createPreviewEdge(
    edge: IEdge,
  ): SimpleEdge
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-dragFinished">Online Documentation</a>
   */
  override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Filters the given `allCandidates` to return the subset of candidates which are relevant at the given `location`.
   * @param [context] The context that is used to retrieve the candidates for.
   * @param [location] The current location.
   * @param [allCandidates] All possible port candidates.
   * @return The filtered list of port candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-filterCandidates">Online Documentation</a>
   */
  protected open fun filterCandidates(
    context: IInputModeContext,
    location: Point,
    allCandidates: IEnumerable<IPortCandidate>,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Finds the closest candidate from the given set of candidates.
   * @param [context] The context in which the closest handle candidate is sought.
   * @param [location] The location for which to find a candidate.
   * @param [candidates] The list of possible candidates.
   * @return The closest candidate or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getClosestCandidate">Online Documentation</a>
   */
  protected open fun getClosestCandidate(
    context: IInputModeContext,
    location: Point,
    candidates: IEnumerable<IPortCandidate>,
  ): IPortCandidate?
  
  /**
   * Gets the [IPortOwner] at the given `location`.
   * @param [context] The input mode context.
   * @param [location] The location to find a port owner at.
   * @return The [IPortOwner] at the given location or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getCurrentOwner">Online Documentation</a>
   */
  protected open fun getCurrentOwner(
    context: IInputModeContext,
    location: Point,
  ): IPortOwner?
  
  /**
   * Gets the graph to use from the context.
   * @param [context] The input mode context.
   * @return A graph instance or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getGraph">Online Documentation</a>
   */
  protected open fun getGraph(
    context: IInputModeContext?,
  ): IGraph?
  
  /**
   * Called during [dragFinished][PortRelocationHandle] to actually get the new port from the chosen candidate.
   * @param [portCandidate] The candidate to get a port instance from.
   * @param [suggestedLocation] The suggested location for the port.
   * @return A non-`null` port instance.
   * @see [setPorts]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getPort">Online Documentation</a>
   */
  protected open fun getPort(
    context: IInputModeContext,
    portCandidate: IPortCandidate,
    suggestedLocation: Point?,
  ): IPort
  
  /**
   * Gets the possible candidates for the given edge.
   * @param [context] The context that is used to retrieve the candidates for.
   * @param [edge] The edge.
   * @param [sourcePort] Whether to look for source port candidates.
   * @return A non-`null` enumerable over the candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getPortCandidates">Online Documentation</a>
   */
  protected open fun getPortCandidates(
    context: IInputModeContext,
    edge: IEdge,
    sourcePort: Boolean,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Retrieves the port candidates during [handleMove][PortRelocationHandle].
   * @param [context] The context that is used to retrieve the candidates for.
   * @param [edge] The edge.
   * @param [sourcePort] Whether to look for source port candidates.
   * @return A non-`null` enumerable over the candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-getPortCandidatesDuringMove">Online Documentation</a>
   */
  protected open fun getPortCandidatesDuringMove(
    context: IInputModeContext,
    edge: IEdge,
    sourcePort: Boolean,
  ): IEnumerable<IPortCandidate>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-handleClick">Online Documentation</a>
   */
  override fun handleClick(
    event: ClickEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-handleMove">Online Documentation</a>
   */
  override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Hides the original edge that during the drag operation.
   * @param [context] The context to get the canvas the edge should be hidden from.
   * @param [edge] The edge to hide.
   * @see [unhideOriginalEdge]
   * @see [visualization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-hideOriginalEdge">Online Documentation</a>
   */
  protected open fun hideOriginalEdge(
    context: IInputModeContext,
    edge: IEdge,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Determines whether [port candidate resolution][PortRelocationHandle] is enabled for the current gesture.
   * @param [context] The context to inspect.
   * @return `true` if port candidates may be resolved; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-isPortCandidateResolutionEnabled">Online Documentation</a>
   */
  protected open fun isPortCandidateResolutionEnabled(
    context: IInputModeContext,
  ): Boolean
  
  /**
   * Tries to [resolve][IPortCandidate] a dynamic port candidate for the given location.
   * @param [context] The context in which the candidate is resolved.
   * @param [portCandidate] The candidate.
   * @param [location] The current location.
   * @return A candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-resolveCandidate">Online Documentation</a>
   */
  protected open fun resolveCandidate(
    context: IInputModeContext,
    portCandidate: IPortCandidate,
    location: Point,
  ): IPortCandidate
  
  /**
   * Updates the closest candidate for visual feedback.
   * @param [portCandidate] The [IPortCandidate] to set as closest candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-setClosestCandidate">Online Documentation</a>
   */
  protected open fun setClosestCandidate(
    portCandidate: IPortCandidate?,
  )
  
  /**
   * Triggered by [dragFinished][PortRelocationHandle] to actually change the port.
   * @param [context] The context.
   * @param [edge] The edge to change ports.
   * @param [setSourcePort] Whether to set the source port. `false` for target ports.
   * @param [portCandidate] The candidate that has been chosen.
   * @param [suggestedLocation] The suggested location for the port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-setPort">Online Documentation</a>
   */
  protected open fun setPort(
    context: IInputModeContext,
    edge: IEdge,
    setSourcePort: Boolean,
    portCandidate: IPortCandidate,
    suggestedLocation: Point?,
  )
  
  /**
   * Finally sets the ports for the edge to the new values.
   * @param [context] The context in which the ports are set.
   * @param [edge] The edge to set the ports for.
   * @param [sourcePort] The (possibly) new source port.
   * @param [targetPort] The (possibly) new target port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-setPorts">Online Documentation</a>
   */
  protected open fun setPorts(
    context: IInputModeContext,
    edge: IEdge,
    sourcePort: IPort,
    targetPort: IPort,
  )
  
  /**
   * Updates the position of the handle.
   * @param [location] The new location of the handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-setPosition">Online Documentation</a>
   */
  protected open fun setPosition(
    location: Point,
  )
  
  /**
   * Updates the preview edge's visual appearance to reflect the new port candidate.
   * @param [preview] The preview edge.
   * @param [source] Whether to update the source or target port.
   * @param [portCandidate] The new candidate to indicate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-setToPortCandidate">Online Documentation</a>
   */
  protected open fun setToPortCandidate(
    preview: SimpleEdge,
    source: Boolean,
    portCandidate: IPortCandidate,
  )
  
  /**
   * Unhides the original edge that was hidden during the drag operation.
   * @param [edge] The edge to unhide.
   * @param [canvasComponent] The control the edge was hidden from.
   * @see [hideOriginalEdge]
   * @see [visualization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-unhideOriginalEdge">Online Documentation</a>
   */
  protected open fun unhideOriginalEdge(
    edge: IEdge,
    canvasComponent: CanvasComponent?,
  )
  
  /**
   * Draws the highlight for the owner of the current port candidate.
   * @param [oldCandidate] The port candidate whose owner is currently highlighted.
   * @param [newCandidate] The port candidate whose owner should be highlighted.
   * @see [showTargetHighlight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortRelocationHandle%23PortRelocationHandle-method-updateHighlight">Online Documentation</a>
   */
  protected open fun updateHighlight(
    oldCandidate: IPortCandidate?,
    newCandidate: IPortCandidate?,
  )
  
  companion object : ClassMetadata<PortRelocationHandle> {
  }
}
