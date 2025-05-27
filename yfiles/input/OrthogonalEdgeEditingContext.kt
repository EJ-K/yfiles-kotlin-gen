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
import yfiles.collections.IListEnumerable
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.IPortOwner
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject

/**
 * Used to interactively reshape orthogonal edge paths.
 * @see [IOrthogonalEdgeHelper]
 * @see [enabled]
 * @see [movePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [OrthogonalEdgeEditingContext] class that is initially [enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-constructor-OrthogonalEdgeEditingContext">Online Documentation</a>
 */
external open class OrthogonalEdgeEditingContext  () : YObject, IEventDispatcher {

/**
 * Gets the previously [registered added][registerAddedBend] bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23addedBends">Online Documentation</a>
 */
protected final val addedBends: IEnumerable<IBend>
/**
 * Gets the current input mode context that is in effect for the current edit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23currentInputModeContext">Online Documentation</a>
 */
protected final val currentInputModeContext: IInputModeContext?
/**
 * Gets or sets a value indicating whether orthogonal edge editing is enabled at all.
 * 
 * The default value is `true`.
 * @see [isOrthogonallyEditedEdge]
 * @see [IOrthogonalEdgeHelper.shouldEditOrthogonally]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23enabled">Online Documentation</a>
 */
final var enabled: Boolean
/**
 * Gets or sets whether the context is initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23isInitialized">Online Documentation</a>
 */
final val isInitialized: Boolean
/**
 * Gets or sets a value indicating whether this instance is currently initializing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23isInitializing">Online Documentation</a>
 */
final val isInitializing: Boolean
/**
 * Gets the enumeration of [IEdge] instances whose ports have been locked at source and target end.
 * @see [MoveTypes.ARBITRARY_MOVE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23lockedPortEdges">Online Documentation</a>
 */
protected final val lockedPortEdges: IEnumerable<IEdge>
/**
 * Gets or sets a value indicating ports are allowed to be moved at all.
 * 
 * The default value is `true`.
 * @see [shouldMoveEndImplicitly]
 * @see [IOrthogonalEdgeHelper.shouldMoveEndImplicitly]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23movePorts">Online Documentation</a>
 */
final var movePorts: Boolean
/**
 * Gets the enumeration of [IPortOwner] instances that are being transformed during the edit.
 * @see [MoveTypes.ARBITRARY_MOVE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23transformedPortOwners">Online Documentation</a>
 */
protected final val transformedPortOwners: IEnumerable<IPortOwner>
/**
 * Registers the provided bend with this instance so that it will be considered explicitly moved for this edit.
 * @param [movementInfo] The movement info that describes the movement of the bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-addExplicitlyMovedBend">Online Documentation</a>
 */
 final   fun addExplicitlyMovedBend( movementInfo: MovementInfo )
/**
 * Registers the provided bend as being moved implicitly for this edit.
 * @param [movementInfo] The movement info for the bend.
 * @return The info that has been registered with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-addImplicitlyMovedBend">Online Documentation</a>
 */
 final   fun addImplicitlyMovedBend( movementInfo: MovementInfo ):MovementInfo
/**
 * Registers the provided end of the edge with this instance so that it will be considered explicitly moved for this edit.
 * @param [movementInfo] The movement info that describes the movement of the end of the edge. The [MovementInfo.movedItem] must be an [IEdge].
 * @param [sourceEnd] `true` if the `movementInfo` represents the source end of the edge.
 * @see [IEdgePortHandleProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-addMovedEdgeEnd">Online Documentation</a>
 */
 final   fun addMovedEdgeEnd( movementInfo: MovementInfo ,
 sourceEnd: Boolean )
/**
 * Registers the provided port with this instance so that it will be considered explicitly moved for this edit.
 * @param [movementInfo] The movement info that describes the movement of the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-addMovedPort">Online Documentation</a>
 */
 final   fun addMovedPort( movementInfo: MovementInfo )
/**
 * Adds an [IPortOwner] that is being transformed somehow during the edit so that the attached [ports][IPortOwner.ports] will be moved in an irregular ([non-linear][MoveTypes.ARBITRARY_MOVE]) way.
 * @param [owner] The item that will be transformed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-addTransformedPortOwner">Online Documentation</a>
 */
 final   fun addTransformedPortOwner( owner: IPortOwner )
/**
 * Called by client edit code when a drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-cancelDrag">Online Documentation</a>
 */
 open   fun cancelDrag()
/**
 * Performs clean up procedures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-cleanUp">Online Documentation</a>
 */
 open protected   fun cleanUp()
/**
 * Cleans up the edge's path after a successfully [finished drag][dragFinished].
 * @param [graph] The graph in which the edge resides.
 * @param [edge] The modified edge.
 * @see [getOrthogonalEdgeHelper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-cleanUpEdgePath">Online Documentation</a>
 */
 open protected   fun cleanUpEdgePath( graph: IGraph ,
 edge: IEdge )
/**
 * Called after a successfully [finished drag][dragFinished] to clean up artifacts of modified edges.
 * @param [graph] The graph.
 * @see [cleanUpEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-cleanUpEdgePaths">Online Documentation</a>
 */
 open protected   fun cleanUpEdgePaths( graph: IGraph )
/**
 * Creates or obtains a previously created [MovementInfo] for the provided implicitly moved bend.
 * @param [bend] The implicitly moved bend.
 * @param [horizontalAdjacentInfo] The movement info that implicitly constrains the horizontal movement of the bend or `null`.
 * @param [verticalAdjacentInfo] The movement info that implicitly constrains the vertical movement of the bend or `null`.
 * @return The info to be used by clients that requested it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-createImplicitlyMovedBendInfo">Online Documentation</a>
 */
 final   fun createImplicitlyMovedBendInfo( bend: IBend ,
 horizontalAdjacentInfo: MovementInfo? ,
 verticalAdjacentInfo: MovementInfo? ):MovementInfo?
/**
 * Called when a drag has been successfully finished.
 * @see [addCleanedUpListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-dragFinished">Online Documentation</a>
 */
 open   fun dragFinished()
/**
 * Needs to be called by client editing code after [initializeDrag] has been called and all [IDragHandler]s have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-dragInitialized">Online Documentation</a>
 */
 open   fun dragInitialized()
/**
 * Gets the [movement infos][MovementInfo] that describe the orthogonal path of the edge.
 * @param [edge] The edge to obtain the infos for.
 * @return An array that contains for the first entry the source end of the edge, then all bends and then as the final entry the target end of the edge. For the bends, this can be be `null` values if nothing is known about the bend, yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-getMovementInfos">Online Documentation</a>
 */
 open protected   fun getMovementInfos( edge: IEdge ):IListEnumerable<MovementInfo>
/**
 * Gets the [IOrthogonalEdgeHelper] instance associated with the given edge.
 * @param [edge] The edge to obtain the helper instance for.
 * @return The helper instance to use or `null`, in which case the default behavior will be used.
 * @see [OrthogonalEdgeHelper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-getOrthogonalEdgeHelper">Online Documentation</a>
 */
 open protected   fun getOrthogonalEdgeHelper( edge: IEdge ):IOrthogonalEdgeHelper?
/**
 * Gets the declared segment orientation for the provided segment at the given edge.
 * @param [edge] The edge to determine the orientation of the segment.
 * @param [segmentIndex] Index of the segment.
 * @return The orientation of the segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-getSegmentOrientation">Online Documentation</a>
 */
 open   fun getSegmentOrientation( edge: IEdge ,
 segmentIndex: Int ):SegmentOrientation
/**
 * Called by client code when a drag is started about to be started.
 * @param [context] The context in which the edit is going to be performed.
 * @throws InvalidOperationError If this context is already [Initialized] or currently [Initializing].
 * @see [dragInitialized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-initializeDrag">Online Documentation</a>
 */
 open   fun initializeDrag( context: IInputModeContext )
/**
 * Called by [IDragHandler]s and the like to determines whether the given edge is orthogonally edited edge in the specified input mode context.
 * @param [context] The input mode context which is editing the edge.
 * @param [edge] The edge that will be edited.
 * @return `true` if this edge should be orthogonally edited for the specified input mode context; `false` otherwise.
 * @see [enabled]
 * @see [IOrthogonalEdgeHelper.shouldEditOrthogonally]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-isOrthogonallyEditedEdge">Online Documentation</a>
 */
 open   fun isOrthogonallyEditedEdge( context: IInputModeContext ,
 edge: IEdge ):Boolean
/**
 * Locks the movement of the ports of the edges so that [shouldMoveEndImplicitly] will yield `false` for the provided edge during the current edit.
 * @param [edge] The edge to lock the ports of.
 * @see [lockedPortEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-lockPortMovement">Online Documentation</a>
 */
 final   fun lockPortMovement( edge: IEdge )
/**
 * Raises the [CleanedUp] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-onCleanedUp">Online Documentation</a>
 */
 open protected   fun onCleanedUp( event: InputModeEventArgs )
/**
 * Raises the [Initialized] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see [addInitializedListener]
 * @see [dragInitialized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-onInitialized">Online Documentation</a>
 */
 open protected   fun onInitialized( event: InputModeEventArgs )
/**
 * Raises the [Initializing] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see [addInitializingListener]
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-onInitializing">Online Documentation</a>
 */
 open protected   fun onInitializing( event: InputModeEventArgs )
/**
 * Called during [dragInitialized] to prepare the edge paths for orthogonal editing.
 * @param [graph] The graph that contains the edges to be edited.
 * @see [prepareOrthogonalEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-prepareEdgePaths">Online Documentation</a>
 */
 open protected   fun prepareEdgePaths( graph: IGraph )
/**
 * Helper method that inspects and prepares an orthogonal edge for the upcoming edit process.
 * @param [graph] The graph to use for modifying the bends.
 * @param [edge] The edge to inspect.
 * @param [orientations] The orientations of the segments - the array is of length (edge.Bends.Count + 1).
 * @param [infos] The [MovementInfo] instances for the source end, the bends, and the target end. This array contains [MovementInfo] instances representing either edge ends or ports at the first and last position and [MovementInfo]s or `null` entries for the bends. The length thus is (edge.Bends.Count + 2) and `null` entries indicate that there is no information about the movement (in case the bend will only be moved implicitly later, if at all).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-prepareOrthogonalEdge">Online Documentation</a>
 */
 open protected   fun prepareOrthogonalEdge( graph: IGraph ,
 edge: IEdge ,
 orientations: IListEnumerable<SegmentOrientation> ,
 infos: IListEnumerable<MovementInfo> )
/**
 * Can be used by subclasses during [prepareOrthogonalEdge] to register added bends that can later be [removed][removeAddedBends] in case the operation is canceled.
 * @param [bend] The bend that has been added to guarantee orthogonality.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-registerAddedBend">Online Documentation</a>
 */
 final protected   fun registerAddedBend( bend: IBend )
/**
 * Removes previously [registered][registerAddedBend] added bends.
 * @param [graph] The graph to use for removing the bends.
 * @param [addedBends] The added bends.
 * @see [addedBends]
 * @see [registerAddedBend]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-removeAddedBends">Online Documentation</a>
 */
 open protected   fun removeAddedBends( graph: IGraph ,
 addedBends: IEnumerable<IBend> )
/**
 * Called by [IDragHandler]s and the like to determines whether the specified end of the provided `edge` should be moved implicitly.
 * @param [edge] The edge for which it should be determined whether the edge end can be moved.
 * @param [sourceSide] if set to `true` the source side of the end is queried, else the target side.
 * @return `true` if the specified side of the edge can be moved; `false` otherwise, in which case the segment should be split to maintain orthogonality.
 * @see [getOrthogonalEdgeHelper]
 * @see [IOrthogonalEdgeHelper.shouldMoveEndImplicitly]
 * @see [movePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-shouldMoveEndImplicitly">Online Documentation</a>
 */
 open   fun shouldMoveEndImplicitly( edge: IEdge ,
 sourceSide: Boolean ):Boolean
/**
 * Occurs when the recent edit operation has been cleaned up.
 * @see [cleanUp]
 * @see [onCleanedUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23CleanedUp">Online Documentation</a>
 */
fun addCleanedUpListener(listener: EventHandler1<InputModeEventArgs>)
fun removeCleanedUpListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the edit is about to be initialized.
 * @see [initializeDrag]
 * @see [onInitializing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23Initializing">Online Documentation</a>
 */
fun addInitializingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the edit has been initialized.
 * @see [dragInitialized]
 * @see [onInitialized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23Initialized">Online Documentation</a>
 */
fun addInitializedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializedListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<OrthogonalEdgeEditingContext> {
/**
 * Creates an [OrthogonalEdgeDragHandler] that keeps the orthogonal edges attached to `portOwner` orthogonal while the port owner is moved or reshaped interactively.
 * @param [context] The input mode context which is editing the node.
 * @param [portOwner] The port owner that is moved or reshaped.
 * @param [linearPortMovement] `true` if ports on the owner move linear with the mouse movement, `false` otherwise.
 * @return An [OrthogonalEdgeDragHandler] for the port owner or `null` if no enabled [OrthogonalEdgeEditingContext] was found.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23OrthogonalEdgeEditingContext-method-createOrthogonalEdgeDragHandler">Online Documentation</a>
 */
 final   fun createOrthogonalEdgeDragHandler( context: IInputModeContext ,
 portOwner: IPortOwner ,
 linearPortMovement: Boolean ):OrthogonalEdgeDragHandler?
}
}

inline fun OrthogonalEdgeEditingContext(
    block: OrthogonalEdgeEditingContext.() -> Unit
): OrthogonalEdgeEditingContext {
    return OrthogonalEdgeEditingContext()
        .apply(block)
}

/**
 * Occurs when the recent edit operation has been cleaned up.
 * @see [cleanUp]
 * @see [onCleanedUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23CleanedUp">Online Documentation</a>
 */
inline fun  OrthogonalEdgeEditingContext.addCleanedUpHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addCleanedUpListener(listener)
    return { removeCleanedUpListener(listener) }
}
/**
 * Occurs when the edit is about to be initialized.
 * @see [initializeDrag]
 * @see [onInitializing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23Initializing">Online Documentation</a>
 */
inline fun  OrthogonalEdgeEditingContext.addInitializingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializingListener(listener)
    return { removeInitializingListener(listener) }
}
/**
 * Occurs when the edit has been initialized.
 * @see [dragInitialized]
 * @see [onInitialized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeEditingContext%23Initialized">Online Documentation</a>
 */
inline fun  OrthogonalEdgeEditingContext.addInitializedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializedListener(listener)
    return { removeInitializedListener(listener) }
}
