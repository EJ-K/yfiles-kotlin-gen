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
import yfiles.graph.BendEventArgs
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An [IInputMode] used for recognizing the gesture of creating [IBend]s in an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that will use the [IGraph] from the [inputModeContext] to create bends in.
 * @see [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-constructor-CreateBendInputMode">Online Documentation</a>
 */
external open class CreateBendInputMode  () : IInputMode, IEventDispatcher {

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
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets an event recognizer that determines when the user is moving the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
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
 * Gets the graph this mode is acting upon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23graph">Online Documentation</a>
 */
final val graph: IGraph?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets the location where the bend creation gesture was initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23location">Online Documentation</a>
 */
final val location: Point
/**
 * Gets or sets an event recognizer that determines when the user begins actually moves the selection via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_MOVE_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23movedRecognizerTouch">Online Documentation</a>
 */
final var movedRecognizerTouch: EventRecognizer
/**
 * Gets or sets an event recognizer that determines when the user begins to move the selection via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_LONG_PRESS_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23prepareRecognizerTouch">Online Documentation</a>
 */
final var prepareRecognizerTouch: EventRecognizer
/**
 * Gets or sets an event recognizer that determines when the user begins to move the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets an event recognizer that determines when the user has finished the move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets an event recognizer that determines when the finalized the gesture via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_UP_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23releasedRecognizerTouch">Online Documentation</a>
 */
final var releasedRecognizerTouch: EventRecognizer
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
 * Gets or sets a property that determines whether this mode should use an existing bend in [createBend] if there is one found at the given location.
 * 
 * The default is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23useExistingBend">Online Documentation</a>
 */
final var useExistingBend: Boolean
/**
 * Called when a bend creation gesture can be started at the current mouse pointer location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-arm">Online Documentation</a>
 */
 open protected   fun arm()
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates the bend.
 * @param [edge] The hit edge.
 * @param [location] The coordinates of the hit.
 * @return The created bend or `null`.
 * @see [createInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-createBend">Online Documentation</a>
 */
 open protected   fun createBend( edge: IEdge ,
 location: Point ):IBend?
/**
 * Creates an [IInputModeContext] for use with the upcoming [IBendCreator.createBend] call in [createBend].
 * @return An instance of [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-createInputModeContext">Online Documentation</a>
 */
 open protected   fun createInputModeContext():IInputModeContext
/**
 * Called when a bend creation gesture can no longer be started at the current mouse pointer location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-disarm">Online Documentation</a>
 */
 open protected   fun disarm()
/**
 * Updates the [splitOrthogonalSegment] property and then delegates to [createBend].
 * @param [edge] The edge to create a bend for.
 * @param [dragLocation] The location at which the user initiated the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-dragSegment">Online Documentation</a>
 */
 open protected   fun dragSegment( edge: IEdge ,
 dragLocation: Point )
/**
 * Finds the edge at the given coordinate.
 * @param [location] The coordinates.
 * @return The edge that has been hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-getEdge">Online Documentation</a>
 */
 open protected   fun getEdge( location: Point ):IEdge?
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Determines whether the current location is valid to begin a bend creation gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-isValidBegin">Online Documentation</a>
 */
 open protected   fun isValidBegin( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Triggers the [BendCreated] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onBendCreated">Online Documentation</a>
 */
 open protected   fun onBendCreated( event: BendEventArgs )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Triggered at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: InputModeEventArgs )
/**
 * Triggered at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: InputModeEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23CreateBendInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs once a bend creation gesture has been recognized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23BendCreated">Online Documentation</a>
 */
fun addBendCreatedListener(listener: EventHandler1<BendEventArgs>)
fun removeBendCreatedListener(listener: EventHandler1<BendEventArgs>)

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)

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
 * Occurs once a bend creation gesture has been recognized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23BendCreated">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addBendCreatedHandler(
    crossinline handler: (event:BendEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<BendEventArgs> = { _, event -> handler(event) }
    addBendCreatedListener(listener)
    return { removeBendCreatedListener(listener) }
}
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23Dragging">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDraggingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23Dragged">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDraggedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateBendInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  CreateBendInputMode.addDragCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
