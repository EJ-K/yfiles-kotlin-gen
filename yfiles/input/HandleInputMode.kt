// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import yfiles.collections.IEnumerable
import yfiles.collections.IObservableCollection
import yfiles.geometry.IMutablePoint
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.IObjectRenderer
import yfiles.view.PointerType

/**
 * An [IInputMode] implementation that can handle a collection of [IHandle]s.
 * @see [IHandle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new mode with no handles initially.
 * @see [handles]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-constructor-HandleInputMode">Online Documentation</a>
 */
open external class HandleInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets an immutable snapshot of the [IModelItem]s affected by the currently modified [handle][HandleInputMode] gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23affectedItems">Online Documentation</a>
   */
  final val affectedItems: IEnumerable<IModelItem>
  
  /**
   * Gets or sets the event recognizer that determines whether to start moving the handle.
   * 
   * The default instance value detects [MOUSE][PointerType] or [PEN][PointerType] [DOWN][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start moving the handle via [TOUCH][PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DOWN][EventRecognizers] which reacts to the user making touch contact with the main touch device. Using [TOUCH_PRIMARY_LONG_PRESS][EventRecognizers] allows for an intuitive alternative configuration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel moving the handle.
   * 
   * The default recognizer detects [ESCAPE_DOWN][EventRecognizers], [CANCEL][yfiles.view.PointerEventType] or [DRAG_CAPTURE_LOST][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether a handle was clicked.
   * 
   * The default recognizer detects [CLICK][yfiles.view.PointerEventType] events for [MOUSE][PointerType] and [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23clickRecognizer">Online Documentation</a>
   */
  final var clickRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether a handle was tapped via [TOUCH][PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_TAP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23clickRecognizerTouch">Online Documentation</a>
   */
  final var clickRecognizerTouch: EventRecognizer
  
  /**
   * Gets the installed [controller][HandleInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets the handle that is currently being moved or `null` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23currentHandle">Online Documentation</a>
   */
  final val currentHandle: IHandle?
  
  /**
   * Gets or sets the event recognizer that can be used by handle implementations to constrain the handle movement.
   * 
   * The default recognizer is [SHIFT_IS_DOWN][EventRecognizers]
   * @see [isDirectionalConstrained]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23directionalConstraintRecognizer">Online Documentation</a>
   */
  final var directionalConstraintRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to temporarily disable snapping.
   * 
   * The default is [ALT_DOWN][EventRecognizers]
   * @see [enableSnappingRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23disableSnappingRecognizer">Online Documentation</a>
   */
  final var disableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to re-enable temporarily disabled snapping.
   * 
   * The default is [ALT_UP][EventRecognizers]
   * @see [disableSnappingRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23enableSnappingRecognizer">Online Documentation</a>
   */
  final var enableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the event recognizer that determines whether to finish moving the handle.
   * 
   * The default recognizer detects [MOUSE][PointerType] or [PEN][PointerType] [UP][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish moving the handle via touch.
   * 
   * The default recognizer is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the collection of [IHandle]s this mode manages.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23handles">Online Documentation</a>
   */
  final var handles: IObservableCollection<IHandle>
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes this input mode's [handles][HandleInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23handlesRenderer">Online Documentation</a>
   */
  final var handlesRenderer: IObjectRenderer<HandlesRenderTag>
  
  /**
   * Gets a value indicating whether a drag operation is currently in progress.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23isDragging">Online Documentation</a>
   */
  final val isDragging: Boolean
  
  /**
   * Gets or sets the event recognizer that determines whether to move the handle.
   * 
   * The default recognizer detects [MOUSE][PointerType] or [PEN][PointerType] [DRAG][yfiles.view.PointerEventType] events with the [MOUSE_LEFT][yfiles.view.PointerButtons] button.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to move the handle via [TOUCH][PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets whether to [request the mutex][ConcurrencyController] when [beginRecognizer][HandleInputMode] or [beginRecognizerTouch][HandleInputMode] was triggered.
   * @see [moveRecognizerTouch]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23requestMutexOnPress">Online Documentation</a>
   */
  final var requestMutexOnPress: Boolean
  
  /**
   * Gets or sets the [GraphSnapContext] which manages snapping model items to certain coordinates (for instance, other items).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23snapContext">Online Documentation</a>
   */
  final var snapContext: GraphSnapContext?
  
  /**
   * Gets or sets a value indicating whether handles are drawn in view coordinates or intermediate coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23useViewCoordinates">Online Documentation</a>
   */
  final var useViewCoordinates: Boolean
  
  /**
   * Adds a handle to the collection of handles managed by this instance.
   * @param [handle] The handle to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-addHandle(IHandle)">Online Documentation</a>
   */
  fun addHandle(
    handle: IHandle,
  )
  
  /**
   * Factory method that creates and [adds][HandleInputMode] a handle to this mode by wrapping a given [IMutablePoint] instance.
   * @param [location] The point to use as a handle.
   * @param [cursor] The cursor to use.
   * @param [type] The type of the handle to create.
   * @return The handle created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-addHandle(IMutablePoint,Cursor,HandleType)">Online Documentation</a>
   */
  fun addHandle(
    location: IMutablePoint,
    cursor: Cursor  = definedExternally,
    type: HandleType  = definedExternally,
  ): IHandle
  
  /**
   * Invoked when this mode gets "armed".
   * @param [handle] The handle from which the cursor is queried.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-arm">Online Documentation</a>
   */
  protected open fun arm(
    handle: IHandle?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an [IInputModeContext] for use with the [IHandle] interface for the upcoming drag operation.
   * @return An instance of [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
   * @return An input mode event argument that is configured for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-createInputModeEventArgs">Online Documentation</a>
   */
  protected open fun createInputModeEventArgs(): InputModeEventArgs
  
  /**
   * Invoked when this mode gets "disarmed".
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-disarm">Online Documentation</a>
   */
  protected open fun disarm()
  
  /**
   * Finds the closest hit handle for the given world coordinate pair.
   * 
   * The default implementation first dispatches the [query-closest-handle][HandleInputMode] event and evaluates whether it was [handled][QueryClosestHandleEventArgs].
   * If the event was not handled, it delegates to [getClosestHitHandle][HandleInputMode].
   * @param [location] The coordinates in the world coordinate system.
   * @return The closest handle that has been hit or `null`
   * @see [query-closest-handle]
   * @see [getClosestHitHandle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getClosestHandleAt">Online Documentation</a>
   */
  protected open fun getClosestHandleAt(
    location: Point,
  ): IHandle?
  
  /**
   * Finds the closest hit handle for the given world coordinate pair.
   * 
   * The default implementation compares the Manhattan distance of the handles to find the closest handle.
   * @param [location] The coordinates in the world coordinate system.
   * @param [pointerType] The pointer-type of the last input event.
   * @return The closest handle that has been hit or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getClosestHitHandle">Online Documentation</a>
   */
  protected open fun getClosestHitHandle(
    location: Point,
    pointerType: PointerType,
  ): IHandle?
  
  /**
   * Calculates the offset between the given `handle`'s visual location and its logical location.
   * @param [handle] The handle to hit test or render.
   * @return A coordinate pair representing the offsets in x- and y-direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getHandleOffset">Online Documentation</a>
   */
  open fun getHandleOffset(
    handle: IHandle,
  ): Point
  
  /**
   * Calls [handleClick][IHandle] of the `handle` with the `event`.
   * @param [context] The current input mode context.
   * @param [event] Arguments describing the click.
   * @param [handle] The handle that was clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-handleClick">Online Documentation</a>
   */
  protected open fun handleClick(
    context: IInputModeContext,
    event: ClickEventArgs,
    handle: IHandle,
  )
  
  /**
   * Determines whether a given handle has been visually hit by the mouse at the given world coordinates.
   * @param [handle] The handle to check
   * @param [location] The view coordinates to check.
   * @param [distance] The distance of the handle to the location. In the default implementation, this is a tuple representing the x- and y-distance of the handle to the location.
   * @param [pointerType] The last event's pointer type to consider.
   * @return Whether the handle has been hit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-handleIsHit">Online Documentation</a>
   */
  protected open fun handleIsHit(
    handle: IHandle,
    location: Point,
    distance: Point,
    pointerType: PointerType,
  ): Boolean
  
  /**
   * Installs the visual representation of the handles into the canvas into the [inputModeGroup][yfiles.view.RenderTree].
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][HandleInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][HandleInputMode] for this mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * [Invalidates][yfiles.view.CanvasComponent] the canvas this mode is currently installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-invalidate">Online Documentation</a>
   */
  protected fun invalidate()
  
  /**
   * Returns whether this input mode has the [mutex][ConcurrencyController] and the [directionalConstraintRecognizer][HandleInputMode] recognized a directional constrained move for the [lastInputEvent][yfiles.view.CanvasComponent].
   * @return `true`, if this input mode has the mutex and the last input event was recognized by the [directionalConstraintRecognizer][HandleInputMode], `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-isDirectionalConstrained">Online Documentation</a>
   */
  fun isDirectionalConstrained(): Boolean
  
  /**
   * Returns whether this input mode has the [mutex][ConcurrencyController] and the [disableSnappingRecognizer][HandleInputMode] recognized that snapping shall be temporarily disabled.
   * @return `true`, if this input mode has the mutex and snapping is temporarily disabled, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-isSnappingDisabled">Online Documentation</a>
   */
  fun isSnappingDisabled(): Boolean
  
  /**
   * Called after [cancel][HandleInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Triggers the [clicked][HandleInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onClicked">Online Documentation</a>
   */
  protected open fun onClicked(
    event: ClickEventArgs,
  )
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][HandleInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][HandleInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-started][HandleInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][HandleInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: InputModeEventArgs,
  )
  
  /**
   * Raises the [query-closest-handle][HandleInputMode] event.
   * @param [event] The [query-closest-handle][HandleInputMode] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onQueryClosestHandle">Online Documentation</a>
   */
  protected open fun onQueryClosestHandle(
    event: QueryClosestHandleEventArgs,
  )
  
  /**
   * Called after [tryStop][HandleInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Removes a handle from the collection of handles managed by this instance.
   * @param [handle] The handle to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-removeHandle">Online Documentation</a>
   */
  fun removeHandle(
    handle: IHandle,
  )
  
  /**
   * Method that can be used to initialize the dragging of a given handle manually.
   * @param [handle] The handle to be dragged.
   * @return A [Promise] that resolves when the drag operation is done. It resolves to `true` if the operation is finished successfully and to `false` if the operation is canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-startDrag">Online Documentation</a>
   */
  open fun startDrag(
    handle: IHandle,
  ): Promise<Boolean>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Removes the [IRenderTreeElement][yfiles.view.IRenderTreeElement] that displays the handles from the canvas.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<HandleInputMode> {
  }
}

inline fun HandleInputMode(
    block: HandleInputMode.() -> Unit
): HandleInputMode {
    return HandleInputMode()
        .apply(block)
}

/**
 * `query-closest-handle`: Occurs when this mode queries the closest handle for a certain query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23query-closest-handle">Online Documentation</a>
 */
inline fun  HandleInputMode.addQueryClosestHandleHandler(
  crossinline handler: (event:QueryClosestHandleEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryClosestHandleEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-closest-handle", listener)
  return { removeEventListener("query-closest-handle", listener) }
}

/**
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragFinishingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragFinishedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragStartingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-started">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23dragging">Online Documentation</a>
 */
inline fun  HandleInputMode.addDraggingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23dragged">Online Documentation</a>
 */
inline fun  HandleInputMode.addDraggedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragCancelingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}

/**
 * `clicked`: Occurs when a handle has been [clicked or tapped][yfiles.view.PointerEventType].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23clicked">Online Documentation</a>
 */
inline fun  HandleInputMode.addClickedHandler(
  crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ClickEventArgs> = { event, _ -> handler(event) }
  addEventListener("clicked", listener)
  return { removeEventListener("clicked", listener) }
}
