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
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An input mode that recognizes pointer clicks or taps.
 * @see [clickReportingPolicy]
 * @see [swallowFocusClick]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this mode that detects left mouse clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-constructor-ClickInputMode">Online Documentation</a>
 */
open external class ClickInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets the location of the last click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23clickLocation">Online Documentation</a>
   */
  final val clickLocation: Point
  
  /**
   * Gets or sets when the [clicked][ClickInputMode] event should be raised regarding single clicks.
   * @see [ClickReportingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23clickReportingPolicy">Online Documentation</a>
   */
  final var clickReportingPolicy: ClickReportingPolicy
  
  /**
   * Gets the installed [controller][ClickInputMode].
   * @see [IInputMode.install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets whether to [request the mutex][ConcurrencyController] on a click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23requestMutexOnClick">Online Documentation</a>
   */
  final var requestMutexOnClick: Boolean
  
  /**
   * Gets or sets a property that determines whether clicks should be swallowed if they happen within a short amount of time after the [CanvasComponent][yfiles.view.CanvasComponent] got focus.
   * 
   * The default is `false`. If set to `true`, clicks are discarded within 100 ms after the focus entered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23swallowFocusClick">Online Documentation</a>
   */
  final var swallowFocusClick: Boolean
  
  /**
   * Gets or sets the cursor to use when hovering over a valid hit region.
   * 
   * The default is `null` and the current cursor is used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23validClickHitCursor">Online Documentation</a>
   */
  final var validClickHitCursor: Cursor?
  
  /**
   * Gets or sets a hit test that determines where this mode should recognize clicks.
   * 
   * The default implementation is [ALWAYS][IHitTestable].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23validClickHitTestable">Online Documentation</a>
   */
  final var validClickHitTestable: IHitTestable
  
  /**
   * Gets or sets a hit test that determines where this mode should recognize click events that were caused by touch input.
   * 
   * The default implementation is [ALWAYS][IHitTestable].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23validClickHitTestableTouch">Online Documentation</a>
   */
  final var validClickHitTestableTouch: IHitTestable
  
  /**
   * Cancels the editing of this mode.
   * @see [onCanceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][ClickInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][ClickInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called once this mode has recognized a click gesture.
   * @param [event] The arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onClicked">Online Documentation</a>
   */
  protected open fun onClicked(
    event: ClickEventArgs,
  )
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called after [tryStop][ClickInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<ClickInputMode> {
  }
}

inline fun ClickInputMode(
    block: ClickInputMode.() -> Unit
): ClickInputMode {
    return ClickInputMode()
        .apply(block)
}

/**
 * `clicked`: Occurs once a click or tap has been detected.
 * @see [ClickEventArgs]
 * @see [addClickReportingPolicyHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23clicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addClickedHandler(
  crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ClickEventArgs> = { event, _ -> handler(event) }
  addEventListener("clicked", listener)
  return { removeEventListener("clicked", listener) }
}
