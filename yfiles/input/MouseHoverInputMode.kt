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
import web.html.HTMLElement
import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.TimeSpan
import yfiles.view.Cursor
import yfiles.view.ToolTip
import yfiles.view.ToolTipContent

/**
 * An [IInputMode] that detects when the mouse hovers over the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided optional text provider.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-constructor-MouseHoverInputMode">Online Documentation</a>
 */
external open class MouseHoverInputMode  ( textProvider: EventHandler1<ToolTipQueryEventArgs>?  = definedExternally) : IInputMode, IEventDispatcher {

/**
 * Gets or sets whether the tooltip is closed when the a click is performed over the tooltip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23closeOnClick">Online Documentation</a>
 */
final var closeOnClick: Boolean
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the duration the mouse has to hover in one place to show a tooltip.
 * 
 * The default is one second.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23delay">Online Documentation</a>
 */
final var delay: TimeSpan
/**
 * Gets or sets the duration to show the tooltip.
 * 
 * The default value is 3 seconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23duration">Online Documentation</a>
 */
final var duration: TimeSpan
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the amount the mouse pointer has to move in order to hide the tooltip.
 * 
 * The default is `(10, 10)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23mouseHoverSize">Online Documentation</a>
 */
final var mouseHoverSize: Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets whether the tooltip is currently showing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23showing">Online Documentation</a>
 */
final var showing: Boolean
/**
 * Gets the [toolTip] instance to use during display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23toolTip">Online Documentation</a>
 */
final val toolTip: ToolTip?
/**
 * Gets or sets the tooltip location offset in view coordinates.
 * @see [getToolTipLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23toolTipLocationOffset">Online Documentation</a>
 */
final var toolTipLocationOffset: Point
/**
 * Gets or sets a custom parent element to which the tooltip is added as child in the DOM.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23toolTipParentElement">Online Documentation</a>
 */
final var toolTipParentElement: HTMLElement?
/**
 * Gets or sets the cursor to use when the mouse is at a [valid hover location][validHoverLocationHitTestable].
 * 
 * The default is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23validHoverLocationCursor">Online Documentation</a>
 */
final var validHoverLocationCursor: Cursor?
/**
 * Gets or sets an [IHitTestable] that determines where the mouse may hover and a tooltip can be [shown][onShow].
 * 
 * The default value of this property is [IHitTestable.ALWAYS]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23validHoverLocationHitTestable">Online Documentation</a>
 */
final var validHoverLocationHitTestable: IHitTestable?
/**
 * Adjust the calculated tooltip position.
 * @param [originalPosition] The calculated tooltip position relative to the document root
 * @return The adjusted tooltip location relative to the document root
 * @see [getToolTipLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-adjustTooltipPosition">Online Documentation</a>
 */
 open protected   fun adjustTooltipPosition( originalPosition: Point ):Point
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates an [IInputModeContext] for use with the [QueryToolTip] event for the upcoming text query operation.
 * @return An instance of [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-createHoverInputModeContext">Online Documentation</a>
 */
 open protected   fun createHoverInputModeContext():IInputModeContext
/**
 * Factory method that creates the [toolTip].
 * @return A [toolTip] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-createToolTip">Online Documentation</a>
 */
 open protected   fun createToolTip():ToolTip
/**
 * Callback method that provides a text for the given location, a [Promise] providing a text or `null`.
 * @param [location] The location to find a text for.
 * @return A string, [Promise] or `null` to indicate that no tooltip should be shown.
 * @see [addQueryToolTipListener]
 * @see [createHoverInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-getToolTipContent">Online Documentation</a>
 */
 open protected   fun getToolTipContent( location: Point ):ToolTipContent?
/**
 * Finds the position in canvas view coordinates to display the tooltip at for the given world coordinates.
 * @param [location] The position in world coordinates.
 * @return The position in view coordinates.
 * @see [toolTipLocationOffset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-getToolTipLocation">Online Documentation</a>
 */
 open protected   fun getToolTipLocation( location: Point ):Point
/**
 * Immediately hides the tooltip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-hide">Online Documentation</a>
 */
 open   fun hide()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called when the tooltip should be hidden.
 * @param [tooltip] The tooltip that will be hidden.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onHide">Online Documentation</a>
 */
 open protected   fun onHide( tooltip: ToolTip )
/**
 * Raises the [QueryToolTip] event.
 * @param [event] The [ToolTipQueryEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onQueryToolTip">Online Documentation</a>
 */
 open protected   fun onQueryToolTip( event: ToolTipQueryEventArgs )
/**
 * Triggered when the mouse hovers over the given coordinates.
 * @return A [Promise] that resolves to `true` if the tool tip will be shown or to `false` if the tooltip will not be shown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onShow">Online Documentation</a>
 */
 open protected   fun onShow( location: Point ,
 content: ToolTipContent? ):Promise<Boolean>
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Shows the tooltip at the given location.
 * @param [location] The location in the world coordinate system.
 * @param [content] The content of the tooltip. If `null`, [getToolTipContent] will be called to get the content.
 * @return A [Promise] that resolves to `true` if the tool tip will be shown or to `false` if the tooltip will not be shown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-show">Online Documentation</a>
 */
 open   fun show( location: Point ,
 content: ToolTipContent? ):Promise<Boolean>
/**
 * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController.hasMutex].
 * @return `true` iff this instance does not [own the mutex][ConcurrencyController.hasMutex].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23MouseHoverInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when this mode queries the tooltip for a certain query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23QueryToolTip">Online Documentation</a>
 */
fun addQueryToolTipListener(listener: EventHandler1<ToolTipQueryEventArgs>)
fun removeQueryToolTipListener(listener: EventHandler1<ToolTipQueryEventArgs>)

companion object : ClassMetadata<MouseHoverInputMode> {
}
}

inline fun MouseHoverInputMode(
    block: MouseHoverInputMode.() -> Unit
): MouseHoverInputMode {
    return MouseHoverInputMode()
        .apply(block)
}

/**
 * Occurs when this mode queries the tooltip for a certain query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseHoverInputMode%23QueryToolTip">Online Documentation</a>
 */
inline fun  MouseHoverInputMode.addQueryToolTipHandler(
    crossinline handler: (event:ToolTipQueryEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ToolTipQueryEventArgs> = { _, event -> handler(event) }
    addQueryToolTipListener(listener)
    return { removeQueryToolTipListener(listener) }
}
