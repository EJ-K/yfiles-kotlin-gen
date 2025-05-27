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
import yfiles.view.IRenderContext
import yfiles.view.IVisualTemplate
import yfiles.view.RenderModes
import yfiles.view.ResourceKey
import yfiles.view.SvgVisual

/**
 * An [IInputMode] implementation that can handle a collection of [IHandle]s.
 * @see [IHandle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new mode with no handles initially.
 * @see [handles]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-constructor-HandleInputMode">Online Documentation</a>
 */
external open class HandleInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets an immutable snapshot of the [IModelItem]s affected by the currently modified [handle][currentHandle] gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23affectedItems">Online Documentation</a>
 */
final val affectedItems: IEnumerable<IModelItem>
/**
 * Gets or sets the event recognizer that determines whether to cancel moving the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether a handle was clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23clickedRecognizer">Online Documentation</a>
 */
final var clickedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether a handle was tapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23clickedRecognizerTouch">Online Documentation</a>
 */
final var clickedRecognizerTouch: EventRecognizer
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets the handle that is currently being moved or `null` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23currentHandle">Online Documentation</a>
 */
final val currentHandle: IHandle?
/**
 * Gets or sets the event recognizer that determines whether to temporarily disable snapping.
 * @see [enableSnappingRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23disableSnappingRecognizer">Online Documentation</a>
 */
final var disableSnappingRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move the handle via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23draggedRecognizerTouch">Online Documentation</a>
 */
final var draggedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to reenable temporarily disabled snapping.
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
 * Gets or sets the collection of [IHandle]s this mode manages.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23handles">Online Documentation</a>
 */
final var handles: IObservableCollection<IHandle>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets a value indicating whether a drag operation is currently in progress.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23isDragging">Online Documentation</a>
 */
final val isDragging: Boolean
/**
 * Gets or sets the event recognizer that determines whether to start moving the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start moving the handle via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23pressedRecognizerTouch">Online Documentation</a>
 */
final var pressedRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to finish moving the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish moving the handle via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23releasedRecognizerTouch">Online Documentation</a>
 */
final var releasedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the mode used to render the handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23renderMode">Online Documentation</a>
 */
final var renderMode: RenderModes
/**
 * Gets or sets whether to [request the mutex][ConcurrencyController.requestMutex] when [pressedRecognizer] or [pressedRecognizerTouch] was triggered.
 * @see [draggedRecognizerTouch]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23requestMutexOnPress">Online Documentation</a>
 */
final var requestMutexOnPress: Boolean
/**
 * Gets or sets the [snapContext] which manages snapping model items to certain coordinates (for instance, other items).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23snapContext">Online Documentation</a>
 */
final var snapContext: SnapContext?
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
 final   fun addHandle( handle: IHandle )
/**
 * Factory method that creates and [adds][addHandle] a handle to this mode by wrapping a given [IMutablePoint] instance.
 * @param [location] The point to use as a handle.
 * @param [cursor] The cursor to use.
 * @param [type] The type of the handle to create.
 * @return The handle created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-addHandle(IMutablePoint,Cursor,HandleTypes)">Online Documentation</a>
 */
 final   fun addHandle( location: IMutablePoint ,
 cursor: Cursor?  = definedExternally,
 type: HandleTypes  = definedExternally):IHandle
/**
 * Invoked when this mode gets "armed".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-arm">Online Documentation</a>
 */
 open protected   fun arm( handle: IHandle? )
/**
 * Method that can be used to initialize the dragging of a given handle by hand.
 * @param [handle] The handle to be dragged.
 * @return A [Promise] that resolves when the drag operation is done. It resolves to `true` if the operation is finished successfully and to `false` if the operation is canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-beginDragging">Online Documentation</a>
 */
 open   fun beginDragging( handle: IHandle ):Promise<Boolean>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates an [IInputModeContext] for use with the [IHandle] interface for the upcoming drag operation.
 * @return An instance of [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-createHandleInputModeContext">Online Documentation</a>
 */
 open protected   fun createHandleInputModeContext():IInputModeContext
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs():InputModeEventArgs
/**
 * Creates the [Visual][yfiles.view.Visual] for the given handle, if [renderMode] is set to [RenderModes.SVG].
 * @param [context] The context that describes where the visual will be used.
 * @param [handle] The handle to create a visual representation for.
 * @return The [Visual][yfiles.view.Visual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-createVisual">Online Documentation</a>
 */
 open protected   fun createVisual( context: IRenderContext ,
 handle: IHandle? ):SvgVisual
/**
 * Invoked when this mode gets "disarmed".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-disarm">Online Documentation</a>
 */
 open protected   fun disarm()
/**
 * Finds the closest hit handle for the given world coordinate pair.
 * 
 * The default implementation first dispatches the [QueryClosestHandle] event and evaluates whether it was [QueryClosestHandleEventArgs.handled].
 * If the event was not handled, it delegates to [getClosestHitHandle] or [getClosestHitHandleTouch] depending on the type of the last processed input event.
 * @param [location] The coordinates in the world coordinate system.
 * @return The closest handle that has been hit or `null`
 * @see [addQueryClosestHandleListener]
 * @see [getClosestHitHandle]
 * @see [getClosestHitHandleTouch]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getClosestHandleAt">Online Documentation</a>
 */
 open protected   fun getClosestHandleAt( location: Point ):IHandle?
/**
 * Finds the closest hit handle for the given world coordinate pair.
 * 
 * The default implementation compares the Manhattan distance of the handles to find the closest handle.
 * @param [location] The coordinates in the world coordinate system.
 * @return The closest handle that has been hit or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getClosestHitHandle">Online Documentation</a>
 */
 open protected   fun getClosestHitHandle( location: Point ):IHandle?
/**
 * Finds the closest hit handle for the given world coordinate pair.
 * @param [location] The coordinates in the world coordinate system.
 * @return The closest handle that has been hit or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-getClosestHitHandleTouch">Online Documentation</a>
 */
 open protected   fun getClosestHitHandleTouch( location: Point ):IHandle?
/**
 * Calls [IHandle.handleClick] of the `handle` with the `event`.
 * @param [context] The current input mode context.
 * @param [event] Arguments describing the click.
 * @param [handle] The handle that was clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-handleClick">Online Documentation</a>
 */
 open protected   fun handleClick( context: IInputModeContext ,
 event: ClickEventArgs ,
 handle: IHandle )
/**
 * Determines whether a given handle has been visually hit by the mouse at the given world coordinates.
 * @param [handle] The handle to check
 * @param [location] The view coordinates to check.
 * @param [distance] The distance of the handle to the location. In the default implementation, this is a tuple representing the x- and y-distance of the handle to the location.
 * @return Whether the handle has been hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-handleIsHit">Online Documentation</a>
 */
 open protected   fun handleIsHit( handle: IHandle ,
 location: Point ,
 distance: Point ):Boolean
/**
 * Determines whether a given handle has been visually hit by the touch device at the given world coordinates.
 * @param [handle] The handle to check
 * @param [location] The world coordinates to check.
 * @param [distance] The distance of the handle to the touch location. In the default implementation, this is a tuple representing the x- and y-distance of the handle to the touch location.
 * @return Whether the handle has been hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-handleIsHitTouch">Online Documentation</a>
 */
 open protected   fun handleIsHitTouch( handle: IHandle ,
 location: Point ,
 distance: Point ):Boolean
/**
 * Installs the visual representation of the handles into the canvas into the [CanvasComponent.inputModeGroup][yfiles.view.CanvasComponent.inputModeGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * [Invalidates][yfiles.view.CanvasComponent.invalidate] the canvas this mode is currently installed in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-invalidate">Online Documentation</a>
 */
 final protected   fun invalidate()
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Triggers the [Clicked] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onClicked">Online Documentation</a>
 */
 open protected   fun onClicked( event: ClickEventArgs )
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: InputModeEventArgs )
/**
 * Triggered once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: InputModeEventArgs )
/**
 * Triggered before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: InputModeEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: InputModeEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: InputModeEventArgs )
/**
 * Triggered at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: InputModeEventArgs )
/**
 * Triggered at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: InputModeEventArgs )
/**
 * Raises the [QueryClosestHandle] event.
 * @param [event] The [QueryClosestHandle] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onQueryClosestHandle">Online Documentation</a>
 */
 open protected   fun onQueryClosestHandle( event: QueryClosestHandleEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Removes a handle from the collection of handles managed by this instance.
 * @param [handle] The handle to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-removeHandle">Online Documentation</a>
 */
 final   fun removeHandle( handle: IHandle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Removes the [ICanvasObject][yfiles.view.ICanvasObject] that displays the handles from the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HandleInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when this mode queries the closest handle for a certain query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23QueryClosestHandle">Online Documentation</a>
 */
fun addQueryClosestHandleListener(listener: EventHandler1<QueryClosestHandleEventArgs>)
fun removeQueryClosestHandleListener(listener: EventHandler1<QueryClosestHandleEventArgs>)

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when a handle has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Clicked">Online Documentation</a>
 */
fun addClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeClickedListener(listener: EventHandler1<ClickEventArgs>)

companion object : ClassMetadata<HandleInputMode> {
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.DEFAULT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_DEFAULT_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_DEFAULT_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.DEFAULT] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_DEFAULT_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_DEFAULT_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.DEFAULT] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_DEFAULT_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_DEFAULT_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.DEFAULT] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_DEFAULT_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_DEFAULT_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.INVISIBLE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_INVISIBLE_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_INVISIBLE_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.INVISIBLE] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_INVISIBLE_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_INVISIBLE_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.INVISIBLE] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_INVISIBLE_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_INVISIBLE_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.INVISIBLE] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_INVISIBLE_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_INVISIBLE_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.MOVE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_MOVE_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_MOVE_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.MOVE] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_MOVE_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_MOVE_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.MOVE] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_MOVE_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_MOVE_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.MOVE] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_MOVE_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_MOVE_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.RESIZE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_RESIZE_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_RESIZE_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.RESIZE] | [HandleTypes.VARIANT2]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_RESIZE_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_RESIZE_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.RESIZE] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_RESIZE_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_RESIZE_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.RESIZE] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_RESIZE_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_RESIZE_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.ROTATE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_ROTATE_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_ROTATE_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.ROTATE] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_ROTATE_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_ROTATE_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.ROTATE] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_ROTATE_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_ROTATE_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.ROTATE] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_ROTATE_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_ROTATE_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.SHEAR].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_SHEAR_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_SHEAR_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.SHEAR] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_SHEAR_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_SHEAR_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.SHEAR] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_SHEAR_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_SHEAR_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.SHEAR] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_SHEAR_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_SHEAR_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.WARP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_WARP_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_WARP_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.WARP] | [HandleTypes.VARIANT2].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_WARP_VARIANT2_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_WARP_VARIANT2_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.WARP] | [HandleTypes.VARIANT3].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_WARP_VARIANT3_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_WARP_VARIANT3_KEY: ResourceKey<IVisualTemplate<IHandle>>
/**
 * A [String] that can be used by instances of the [HandleInputMode] to look up a [IVisualTemplate] that will be used for the rendering of [IHandle]s of [type][HandleTypes] [HandleTypes.WARP] | [HandleTypes.VARIANT4].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23HANDLE_DRAWING_WARP_VARIANT4_KEY">Online Documentation</a>
 */
 val HANDLE_DRAWING_WARP_VARIANT4_KEY: ResourceKey<IVisualTemplate<IHandle>>
}
}

inline fun HandleInputMode(
    block: HandleInputMode.() -> Unit
): HandleInputMode {
    return HandleInputMode()
        .apply(block)
}

/**
 * Occurs when this mode queries the closest handle for a certain query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23QueryClosestHandle">Online Documentation</a>
 */
inline fun  HandleInputMode.addQueryClosestHandleHandler(
    crossinline handler: (event:QueryClosestHandleEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryClosestHandleEventArgs> = { _, event -> handler(event) }
    addQueryClosestHandleListener(listener)
    return { removeQueryClosestHandleListener(listener) }
}
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragFinishingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragFinishedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragStartingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Dragging">Online Documentation</a>
 */
inline fun  HandleInputMode.addDraggingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Dragged">Online Documentation</a>
 */
inline fun  HandleInputMode.addDraggedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  HandleInputMode.addDragCancelingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
/**
 * Occurs when a handle has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleInputMode%23Clicked">Online Documentation</a>
 */
inline fun  HandleInputMode.addClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addClickedListener(listener)
    return { removeClickedListener(listener) }
}
