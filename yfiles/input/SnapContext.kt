// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IObservableCollection
import yfiles.collections.List
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject
import yfiles.view.CanvasComponent
import yfiles.view.CollectionModelManager
import yfiles.view.ICanvasObjectDescriptor

/**
 * Manages interactive snapping of elements to other elements during drag operations like movements.
 * @see [HandleInputMode.snapContext]
 * @see [MoveInputMode.snapContext]
 * @see [createSnapResultsModelManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SnapContext] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-constructor-SnapContext">Online Documentation</a>
 */
external open class SnapContext  () : YObject, IEventDispatcher {

/**
 * Gets the current input mode context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23currentInputModeContext">Online Documentation</a>
 */
protected final val currentInputModeContext: IInputModeContext?
/**
 * Gets or sets a value indicating whether this [SnapContext] is enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23enabled">Online Documentation</a>
 */
final var enabled: Boolean
/**
 * Gets or sets the GridSnapDistance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23gridSnapDistance">Online Documentation</a>
 */
final var gridSnapDistance: Double
/**
 * Gets or sets the type of the grid snapping that should be performed.
 * @see [GraphSnapContext.nodeGridConstraintProvider]
 * @see [GraphSnapContext.bendGridConstraintProvider]
 * @see [GraphSnapContext.portGridConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23gridSnapType">Online Documentation</a>
 */
final var gridSnapType: GridSnapTypes
/**
 * Gets whether the context is initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23isInitialized">Online Documentation</a>
 */
final val isInitialized: Boolean
/**
 * Gets or sets a value indicating whether this instance is currently initializing.
 * @see [addInitializedListener]
 * @see [addInitializingListener]
 * @see [isInitialized]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23isInitializing">Online Documentation</a>
 */
final val isInitializing: Boolean
/**
 * Gets the original location of the mouse at the time the gesture was initialized.
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23originalLocation">Online Documentation</a>
 */
final val originalLocation: Point
/**
 * Gets or sets the global snap distance, which is the maximum distance between the current mouse coordinates and the coordinates to which the mouse will snap.
 * @see [CollectSnapResultsEventArgs.snapDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23snapDistance">Online Documentation</a>
 */
final var snapDistance: Double
/**
 * Gets the collection of [SnapResult]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23snapResults">Online Documentation</a>
 */
final val snapResults: IObservableCollection<SnapResult>
/**
 * Gets or sets a value indicating whether to visualize the snap results.
 * @see [createSnapResultsModelManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23visualizeSnapResults">Online Documentation</a>
 */
final var visualizeSnapResults: Boolean
/**
 * Called when a drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-cancelDrag">Online Documentation</a>
 */
 open   fun cancelDrag()
/**
 * Performs clean up procedures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-cleanUp">Online Documentation</a>
 */
 open protected   fun cleanUp()
/**
 * Helper method used by [createSnapResultsModelManager] to create the [ICanvasObjectDescriptor] for the [SnapResult] type.
 * @return An instance that can install [SnapResult]s in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-createSnapResultCanvasObjectDescriptor">Online Documentation</a>
 */
 open   fun createSnapResultCanvasObjectDescriptor():ICanvasObjectDescriptor<SnapResult>
/**
 * Helper method that creates the a [CollectionModelManager] that can be used to present the current [SnapResult]s in the provided [CanvasComponent].
 * @param [canvas] The control to initialize the [CollectionModelManager] with.
 * @return The model manager that manages the visual representation of the [SnapResult]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-createSnapResultsModelManager">Online Documentation</a>
 */
 open   fun createSnapResultsModelManager( canvas: CanvasComponent ):CollectionModelManager<SnapResult>
/**
 * Called when a drag has been successfully finished.
 * @param [newLocation] The current mouse location.
 * @param [snappingDisabled] If set to `true` snapping is temporarily disabled. This will remove the snap line visualizations and return a [SnapState] with the unchanged coordinates and the [SnapTypes.NOT_SNAPPED] [SnapState.snapType].
 * @return A [SnapState] that specifies the adjusted coordinates and how they have been adjusted. The unchanged coordinates if snapping has been temporarily disabled by setting `snappingDisabled` to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-dragFinished">Online Documentation</a>
 */
 open   fun dragFinished( newLocation: Point ,
 snappingDisabled: Boolean ):SnapState
/**
 * Collects a list of snap lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-dragInitialized">Online Documentation</a>
 */
 open   fun dragInitialized()
/**
 * This method needs to be called by the client [IInputMode] that [initialized][initializeDrag] this instance after it has performed the actual move operation with the adjusted coordinates after a call to [handleMove].
 * @param [mouseLocation] The actual mouse location.
 * @param [finalSnapState] The final snap state that contains the location that has been used by the client code for the move and how it has been snapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-dragged">Online Documentation</a>
 */
 open   fun dragged( mouseLocation: Point ,
 finalSnapState: SnapState )
/**
 * Handles a move.
 * @param [newLocation] The current mouse location.
 * @param [snappingDisabled] If set to `true` snapping is temporarily disabled. This will remove the snap line visualizations and return a [SnapState] with the unchanged coordinates and the [SnapState.snapType] [SnapTypes.NOT_SNAPPED].
 * @return The adjusted coordinates and how they have been adjusted. The unchanged coordinates if snapping has been temporarily disabled by setting `snappingDisabled` to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-handleMove">Online Documentation</a>
 */
 open   fun handleMove( newLocation: Point ,
 snappingDisabled: Boolean ):SnapState
/**
 * Called by [IInputMode] implementations when an interactive drag is started.
 * @param [context] The context in which the interactive drag is started.
 * @param [originalLocation] The original location of the mouse.
 * @throws InvalidOperationError If this context is already [initialized][isInitialized].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-initializeDrag">Online Documentation</a>
 */
 open   fun initializeDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Raises the [cleanUp] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-onCleanUp">Online Documentation</a>
 */
 open protected   fun onCleanUp( event: InputModeEventArgs )
/**
 * Raises the [CollectSnapResults] event.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-onCollectSnapResults">Online Documentation</a>
 */
 open protected   fun onCollectSnapResults( event: CollectSnapResultsEventArgs )
/**
 * Raises the [Initialized] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-onInitialized">Online Documentation</a>
 */
 open protected   fun onInitialized( event: InputModeEventArgs )
/**
 * Raises the [Initializing] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-onInitializing">Online Documentation</a>
 */
 open protected   fun onInitializing( event: InputModeEventArgs )
/**
 * Chooses the current [SnapResult]s from a temporary list.
 * @param [snapResults] A temporary list of suggested [SnapResult]s.
 * @param [originalLocation] The point in world coordinates where the mouse move started.
 * @param [newLocation] The current mouse location.
 * @return The adjusted coordinates and how they have been adjusted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-processSnapResults">Online Documentation</a>
 */
 open protected   fun processSnapResults( snapResults: List<SnapResult> ,
 originalLocation: Point ,
 newLocation: Point ):SnapState
/**
 * Helper method that wraps the given `context` so that a [ILookup.lookup][yfiles.graph.ILookup.lookup] query on the wrapped context for the [SnapContext] type yields this instance.
 * @param [context] The context to wrap and delegate all calls to.
 * @return A modified instance that yields this instance if it is queried for the [SnapContext] type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23SnapContext-method-wrapContext">Online Documentation</a>
 */
 open   fun wrapContext( context: IInputModeContext ):IInputModeContext
/**
 * Occurs while [moving][IDragHandler.handleMove] items and handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23CollectSnapResults">Online Documentation</a>
 */
fun addCollectSnapResultsListener(listener: EventHandler1<CollectSnapResultsEventArgs>)
fun removeCollectSnapResultsListener(listener: EventHandler1<CollectSnapResultsEventArgs>)

/**
 * Occurs when this instance has been cleaned up.
 * @see [cleanUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23CleanedUp">Online Documentation</a>
 */
fun addCleanedUpListener(listener: EventHandler1<InputModeEventArgs>)
fun removeCleanedUpListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when this instance has been initialized.
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23Initialized">Online Documentation</a>
 */
fun addInitializedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when this instance is about to be initialized.
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23Initializing">Online Documentation</a>
 */
fun addInitializingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializingListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<SnapContext> {
}
}

inline fun SnapContext(
    block: SnapContext.() -> Unit
): SnapContext {
    return SnapContext()
        .apply(block)
}

/**
 * Occurs while [moving][IDragHandler.handleMove] items and handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23CollectSnapResults">Online Documentation</a>
 */
inline fun  SnapContext.addCollectSnapResultsHandler(
    crossinline handler: (event:CollectSnapResultsEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<CollectSnapResultsEventArgs> = { _, event -> handler(event) }
    addCollectSnapResultsListener(listener)
    return { removeCollectSnapResultsListener(listener) }
}
/**
 * Occurs when this instance has been cleaned up.
 * @see [cleanUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23CleanedUp">Online Documentation</a>
 */
inline fun  SnapContext.addCleanedUpHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addCleanedUpListener(listener)
    return { removeCleanedUpListener(listener) }
}
/**
 * Occurs when this instance has been initialized.
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23Initialized">Online Documentation</a>
 */
inline fun  SnapContext.addInitializedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializedListener(listener)
    return { removeInitializedListener(listener) }
}
/**
 * Occurs when this instance is about to be initialized.
 * @see [initializeDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapContext%23Initializing">Online Documentation</a>
 */
inline fun  SnapContext.addInitializingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializingListener(listener)
    return { removeInitializingListener(listener) }
}
