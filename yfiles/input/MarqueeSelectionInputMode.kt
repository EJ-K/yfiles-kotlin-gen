// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.core.Void
import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.IVisualTemplate
import yfiles.view.ResourceKey

/**
 * An [IInputMode] implementation that can handle marquee selections performed by the user with a mouse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the marquee selection mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-constructor-MarqueeSelectionInputMode">Online Documentation</a>
 */
external open class MarqueeSelectionInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets the event recognizer that determines whether to cancel marquee selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the event recognizer that determines whether to drag the marquee.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to drag the marquee via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23draggedRecognizerTouch">Online Documentation</a>
 */
final var draggedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the cursor to use during the dragging of the marquee.
 * 
 * The default is `Cursors.Cross`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23marqueeCursor">Online Documentation</a>
 */
final var marqueeCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether to start creating the marquee.
 * 
 * By default this recognizer detects left mouse button presses.
 * If this mode is a child mode of the [GraphViewerInputMode] and created by method [GraphViewerInputMode.createMarqueeSelectionInputMode] the recognizer is changed to left mouse button press with Shift held down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start creating the marquee via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23pressedRecognizerTouch">Online Documentation</a>
 */
final var pressedRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to finish creating the marquee.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish creating the marquee via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23releasedRecognizerTouch">Online Documentation</a>
 */
final var releasedRecognizerTouch: EventRecognizer
/**
 * Gets the current or last marquee selection in world coordinates as a path.
 * @see [selectionRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23selectionPath">Online Documentation</a>
 */
final val selectionPath: GeneralPath
/**
 * Gets the current or last marquee selection rectangle.
 * @see [selectionPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23selectionRectangle">Online Documentation</a>
 */
final val selectionRectangle: Rect
/**
 * Gets or sets the template that is used for the visualization of the marquee rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23template">Online Documentation</a>
 */
final var template: IVisualTemplate<Void>?
/**
 * Gets or sets a value indicating whether the marquee rectangle is drawn in view coordinates (which include [CanvasComponent.projection][yfiles.view.CanvasComponent.projection]), or intermediate coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * Gets or sets the cursor to use when beginning the dragging of the marquee is [valid][validBeginRecognizer].
 * 
 * The default is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23validBeginCursor">Online Documentation</a>
 */
final var validBeginCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether it is valid to begin drawing the marquee.
 * 
 * The default value is [EventRecognizers.ALWAYS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23validBeginRecognizer">Online Documentation</a>
 */
final var validBeginRecognizer: EventRecognizer
/**
 * Calculates the location and size of the marquee rectangle.
 * 
 * The default implementation returns a rectangle that is exactly large enough to contain the two specified points.
 * @param [startDragLocation] the location in world coordinates where the drag has been started
 * @param [currentDragLocation] the current location of the drag in world coordinates
 * @return the marquee rectangle to be determined from the given locations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-calculateMarqueeRectangle">Online Documentation</a>
 */
 open protected   fun calculateMarqueeRectangle( startDragLocation: Point ,
 currentDragLocation: Point ):Rect
/**
 * Cancels any pending marquee selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs():MarqueeSelectionEventArgs
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: MarqueeSelectionEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: MarqueeSelectionEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: MarqueeSelectionEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: MarqueeSelectionEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: MarqueeSelectionEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: MarqueeSelectionEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: MarqueeSelectionEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: MarqueeSelectionEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDraggingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDraggedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<MarqueeSelectionEventArgs>)

companion object : ClassMetadata<MarqueeSelectionInputMode> {
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual that will be used to draw the marquee box.
 * 
 * The default template has the `yfiles-marquee-rect-template` CSS class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MARQUEE_RECTANGLE_TEMPLATE_KEY">Online Documentation</a>
 */
 val MARQUEE_RECTANGLE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
}
}

inline fun MarqueeSelectionInputMode(
    block: MarqueeSelectionInputMode.() -> Unit
): MarqueeSelectionInputMode {
    return MarqueeSelectionInputMode()
        .apply(block)
}

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23Dragging">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDraggingHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23Dragged">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDraggedHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragCanceledHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragCancelingHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragFinishingHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragFinishedHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragStartingHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragStartedHandler(
    crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
    val listener: EventHandler1<MarqueeSelectionEventArgs> = { _, event -> handler(event.rectangle) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
