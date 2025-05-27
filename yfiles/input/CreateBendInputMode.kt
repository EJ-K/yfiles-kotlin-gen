// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An [IInputMode] used for recognizing the gesture of creating [IBend]s in an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that will use the [IGraph] from the [parentInputModeContext][CreateBendInputMode] to create bends in.
 * @see [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-constructor-CreateBendInputMode">Online Documentation</a>
 */
open external class CreateBendInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets the cursor to use when this mode is in "armed" state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23armedCursor">Online Documentation</a>
   */
  final var armedCursor: Cursor?
  
  /**
   * Gets or sets the [IHitTestable] that determines where bends may be created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23beginHitTestable">Online Documentation</a>
   */
  final var beginHitTestable: IHitTestable
  
  /**
   * Gets or sets the event recognizer that determines when the user begins bend creation.
   * 
   * The default recognizer detects [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] [DOWN][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets an event recognizer that determines when the user begins bend creation via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_LONG_PRESS][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets the installed [controller][CreateBendInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the event recognizer that determines when the user has finished bend creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines when the user has finished bend creation via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets the graph this mode is acting upon.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23graph">Online Documentation</a>
   */
  final val graph: IGraph?
  
  /**
   * Gets the location where the bend creation gesture was initialized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23location">Online Documentation</a>
   */
  final val location: Point
  
  /**
   * Gets or sets the event recognizer that determines when the user is moving the new bend.
   * 
   * The default recognizer is [MOUSE_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines when the user moves the new bend via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets a value indicating whether an orthogonal segment should be split by the last bend creation.
   * @see [splitOrthogonalSegmentRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23splitOrthogonalSegment">Online Documentation</a>
   */
  final var splitOrthogonalSegment: Boolean
  
  /**
   * Gets or sets an event recognizer that determines whether the bend creation should be treated as a split segment operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23splitOrthogonalSegmentRecognizer">Online Documentation</a>
   */
  final var splitOrthogonalSegmentRecognizer: EventRecognizer
  
  /**
   * Gets or sets a property that determines whether this mode should use an existing bend in [createBend][CreateBendInputMode] if there is one found at the given location.
   * 
   * The default is `true`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23useExistingBend">Online Documentation</a>
   */
  final var useExistingBend: Boolean
  
  /**
   * Gets or sets the event recognizer that determines whether the current location is valid to begin a bend creation gesture.
   * 
   * The default recognizer is [ALWAYS][EventRecognizers].
   * @see [beginHitTestable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23validBeginRecognizer">Online Documentation</a>
   */
  final var validBeginRecognizer: EventRecognizer
  
  /**
   * Called when a bend creation gesture can be started at the current mouse pointer location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-arm">Online Documentation</a>
   */
  protected open fun arm()
  
  /**
   * Cancels the editing of this mode.
   * @see [onCanceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates the bend.
   * @param [edge] The hit edge.
   * @param [location] The coordinates of the hit.
   * @return The created bend or `null`.
   * @see [createInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-createBend">Online Documentation</a>
   */
  protected open fun createBend(
    edge: IEdge,
    location: Point,
  ): IBend?
  
  /**
   * Creates an [IInputModeContext] for use with the upcoming [createBend][IBendCreator] call in [createBend][CreateBendInputMode].
   * @return An instance of [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-createBendCreatorInputModeContext">Online Documentation</a>
   */
  protected open fun createBendCreatorInputModeContext(): IInputModeContext
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Called when a bend creation gesture can no longer be started at the current mouse pointer location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-disarm">Online Documentation</a>
   */
  protected open fun disarm()
  
  /**
   * Updates the [splitOrthogonalSegment][CreateBendInputMode] property and then delegates to [createBend][CreateBendInputMode].
   * @param [edge] The edge to create a bend for.
   * @param [dragLocation] The location at which the user initiated the gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-dragSegment">Online Documentation</a>
   */
  protected open fun dragSegment(
    edge: IEdge,
    dragLocation: Point,
  )
  
  /**
   * Finds the edge at the given coordinates.
   * @param [location] The coordinates.
   * @return The edge that has been hit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-getEdge">Online Documentation</a>
   */
  protected open fun getEdge(
    location: Point,
  ): IEdge?
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][CreateBendInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Triggers the [bend-created][CreateBendInputMode] event.
   * @param [event] The event argument holding the bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onBendCreated">Online Documentation</a>
   */
  protected open fun onBendCreated(
    event: InputModeItemEventArgs<IBend>,
  )
  
  /**
   * Called after [cancel][CreateBendInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][CreateBendInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggered at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: InputModeEventArgs,
  )
  
  /**
   * Called after [tryStop][CreateBendInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<CreateBendInputMode> {
  }
}

inline fun CreateBendInputMode(
    block: CreateBendInputMode.() -> Unit
): CreateBendInputMode {
    return CreateBendInputMode()
        .apply(block)
}

/**
 * `bend-created`: Occurs once a bend has been interactively created by this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23bend-created">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addBendCreatedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IBend>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IBend>> = { event, _ -> handler(event) }
  addEventListener("bend-created", listener)
  return { removeEventListener("bend-created", listener) }
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23dragging">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDraggingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23dragged">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDraggedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDragCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}
