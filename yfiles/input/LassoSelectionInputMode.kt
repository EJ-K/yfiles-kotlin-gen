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
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.Fill
import yfiles.view.IVisualTemplate
import yfiles.view.ResourceKey
import yfiles.view.Stroke

/**
 * An [IInputMode] implementation that can handle lasso selections performed by the user with a mouse or via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the lasso selection mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-constructor-LassoSelectionInputMode">Online Documentation</a>
 */
external open class LassoSelectionInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets the event recognizer that determines whether to cancel lasso selection.
 * 
 * The default recognizer reacts on [KeyEventRecognizers.ESCAPE_DOWN] or [MouseEventRecognizers.LOST_CAPTURE_DURING_DRAG], or [MouseEventRecognizers.RIGHT_UP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the event recognizer that determines whether to drag the lasso free hand.
 * 
 * The default value is [MouseEventRecognizers.LEFT_DRAG].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragFreeRecognizer">Online Documentation</a>
 */
final var dragFreeRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to drag the lasso free hand via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_MOVE_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragFreeRecognizerTouch">Online Documentation</a>
 */
final var dragFreeRecognizerTouch: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to drag a straight-line segment for the lasso.
 * 
 * The default value is [MouseEventRecognizers.MOVE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragSegmentRecognizer">Online Documentation</a>
 */
final var dragSegmentRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to drag a straight-line segment for the lasso via touch.
 * 
 * The default value is [EventRecognizers.NEVER] which means that the straight-line segment will only be finished when switching back to free hand creation or when finishing the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragSegmentRecognizerTouch">Online Documentation</a>
 */
final var dragSegmentRecognizerTouch: EventRecognizer
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets the event recognizer that determines whether to end a segment and switch from segment to freehand mode.
 * 
 * The default value is [MouseEventRecognizers.LEFT_DOWN]. However, since [startSegmentRecognizer] is disabled, this has no effect in the default configuration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23endSegmentRecognizer">Online Documentation</a>
 */
final var endSegmentRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to end a segment and switch from segment to freehand mode via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_DOWN_PRIMARY]. However, since [startSegmentRecognizerTouch] is disabled, this has no effect in the default configuration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23endSegmentRecognizerTouch">Online Documentation</a>
 */
final var endSegmentRecognizerTouch: EventRecognizer
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets the fill that is used for the visualization of the lasso path.
 * @see [LASSO_FILL_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23fill">Online Documentation</a>
 */
final var fill: Fill?
/**
 * Gets or sets the radius in view coordinates around the [startLocation] where the lasso selection can be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRadius">Online Documentation</a>
 */
final var finishRadius: Double
/**
 * Gets or sets the event recognizer that determines whether to finish the gesture away from the [startLocation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRecognizer">Online Documentation</a>
 */
final var finishRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish the gesture away from the [startLocation] via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_UP_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRecognizerTouch">Online Documentation</a>
 */
final var finishRecognizerTouch: EventRecognizer
/**
 * Gets or sets the template that is used for the visualization of the highlighted region around the [startLocation] where the lasso may be finished.
 * @see [FINISH_REGION_HIGHLIGHT_TEMPLATE_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionHighlightTemplate">Online Documentation</a>
 */
final var finishRegionHighlightTemplate: IVisualTemplate<Void>?
/**
 * Gets or sets the event recognizer that determines whether to finish the gesture when near the [startLocation].
 * @see [finishRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionRecognizer">Online Documentation</a>
 */
final var finishRegionRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish the gesture when near the [startLocation] via touch.
 * @see [finishRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionRecognizerTouch">Online Documentation</a>
 */
final var finishRegionRecognizerTouch: EventRecognizer
/**
 * Gets or sets the template that is used for the visualization of the region around the [startLocation] where the lasso may be finished.
 * @see [FINISH_REGION_TEMPLATE_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionTemplate">Online Documentation</a>
 */
final var finishRegionTemplate: IVisualTemplate<Void>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the cursor to use during the dragging of the lasso.
 * 
 * The default is [Cursor.CROSSHAIR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23lassoCursor">Online Documentation</a>
 */
final var lassoCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether to start drawing the lasso.
 * 
 * The default value is [MouseEventRecognizers.LEFT_DOWN].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23prepareRecognizer">Online Documentation</a>
 */
final var prepareRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start drawing the lasso via touch.
 * 
 * The default value is [TouchEventRecognizers.TOUCH_LONG_PRESS_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23prepareRecognizerTouch">Online Documentation</a>
 */
final var prepareRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets the current or last selection path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23selectionPath">Online Documentation</a>
 */
final val selectionPath: GeneralPath
/**
 * Gets the location where the [prepareRecognizer] was triggered and the lasso selection started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startLocation">Online Documentation</a>
 */
protected final val startLocation: Point
/**
 * Gets or sets the event recognizer that determines whether to switch from freehand to segment mode.
 * 
 * The default value is [EventRecognizers.NEVER], which locks this mode in freehand-only mode. However, this can be set differently to allow for a mixed freehand/segment mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startSegmentRecognizer">Online Documentation</a>
 */
final var startSegmentRecognizer: EventRecognizer
/**
 * Gets or sets a recognizer determining when to switch from freehand to segment mode for touch input.
 * 
 * The default value is [EventRecognizers.NEVER], which locks this mode in freehand-only mode. However, this can be set differently to allow for a mixed freehand/segment mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startSegmentRecognizerTouch">Online Documentation</a>
 */
final var startSegmentRecognizerTouch: EventRecognizer
/**
 * Gets or sets the stroke that is used for the visualization of the lasso path.
 * @see [LASSO_STROKE_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the cursor to use when beginning the dragging of the lasso is [valid][validBeginRecognizer].
 * 
 * The default is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validBeginCursor">Online Documentation</a>
 */
final var validBeginCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether it is valid to begin drawing the lasso.
 * 
 * The default value is [EventRecognizers.ALWAYS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validBeginRecognizer">Online Documentation</a>
 */
final var validBeginRecognizer: EventRecognizer
/**
 * Gets or sets the cursor to use when hovering over a valid end location.
 * 
 * The default is `Cursors.Pen`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validEndCursor">Online Documentation</a>
 */
final var validEndCursor: Cursor?
/**
 * Cancels any pending lasso selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs():LassoSelectionEventArgs
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Used by the [finishRecognizer] and [finishRecognizerTouch] to check the current cursor position.
 * @param [location] The location in world coordinates that should be checked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-isValidEndLocation">Online Documentation</a>
 */
 open protected   fun isValidEndLocation( location: Point ):Boolean
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: LassoSelectionEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: LassoSelectionEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: LassoSelectionEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: LassoSelectionEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: LassoSelectionEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: LassoSelectionEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: LassoSelectionEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: LassoSelectionEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDraggingListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDraggedListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs when the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<LassoSelectionEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<LassoSelectionEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<LassoSelectionEventArgs>)

companion object : ClassMetadata<LassoSelectionInputMode> {
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual to indicate the highlighted finish region around the [startLocation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23FINISH_REGION_HIGHLIGHT_TEMPLATE_KEY">Online Documentation</a>
 */
 val FINISH_REGION_HIGHLIGHT_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual to indicate the finish region around the [startLocation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23FINISH_REGION_TEMPLATE_KEY">Online Documentation</a>
 */
 val FINISH_REGION_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that can be used to store a [Fill] for the visualization of the fill of the lasso path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LASSO_FILL_KEY">Online Documentation</a>
 */
 val LASSO_FILL_KEY: ResourceKey<Fill>
/**
 * A [String] that can be used to store a [stroke] for the visualization of the lasso path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LASSO_STROKE_KEY">Online Documentation</a>
 */
 val LASSO_STROKE_KEY: ResourceKey<Stroke>
}
}

inline fun LassoSelectionInputMode(
    block: LassoSelectionInputMode.() -> Unit
): LassoSelectionInputMode {
    return LassoSelectionInputMode()
        .apply(block)
}

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23Dragging">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDraggingHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23Dragged">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDraggedHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragCanceledHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragCancelingHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragFinishingHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs when the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragFinishedHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragStartingHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragStartedHandler(
    crossinline handler: (selectionPath:GeneralPath) -> Unit
): () -> Unit {
    val listener: EventHandler1<LassoSelectionEventArgs> = { _, event -> handler(event.selectionPath) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
