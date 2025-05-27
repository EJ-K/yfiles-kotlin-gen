// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.array.ReadonlyArray
import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.GraphItemTypes
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IGraphSelection
import yfiles.view.ISelectionModel

/**
 * Abstract base class for [GraphViewerInputMode] and [GraphEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode">Online Documentation</a>
 */
external abstract class GraphInputMode  : MultiplexingInputMode, IEventDispatcher {

/**
 * Gets or sets a property that determines whether clipboard operations with the usual shortcuts are enabled on the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23allowClipboardOperations">Online Documentation</a>
 */
final var allowClipboardOperations: Boolean
/**
 * Gets a collection of commands that this input mode will handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23availableCommands">Online Documentation</a>
 */
final val availableCommands: ICollection<out ICommand<*>>
/**
 * Gets or sets the order of the types of items that should be used to determine what item has been clicked or tapped.
 * 
 * Change this field to adjust which items will be [selected][setSelected] if there are multiple items at a given location. The default order is
 * 
 * - [GraphItemTypes.BEND]
 * - [GraphItemTypes.EDGE_LABEL]
 * - [GraphItemTypes.EDGE]
 * - [GraphItemTypes.NODE]
 * - [GraphItemTypes.NODE_LABEL]
 * - [GraphItemTypes.PORT_LABEL]
 * - [GraphItemTypes.PORT]
 * 
 * Arrays that contain strings describing the name of [GraphItemTypes] are converted to an array of [GraphItemTypes]. For example:
 * 
 * ```
 * ['node', 'edge']
 * ['NODE', 'EDGE']
 * ```
 * @see [clickSelectableItems]
 * @see [selectableItems]
 * @see [findItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickHitTestOrder">Online Documentation</a>
 */
final var clickHitTestOrder: ReadonlyArray<GraphItemTypes>
/**
 * Gets or sets the [ClickInputMode] that is used by this instance to determine clicks.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see [onItemClicked]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickInputMode">Online Documentation</a>
 */
final var clickInputMode: ClickInputMode
/**
 * Gets or sets which types of items should be selectable by mouse clicks.
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [shouldClickSelect]
 * @see [setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickSelectableItems">Online Documentation</a>
 */
final var clickSelectableItems: GraphItemTypes
/**
 * Gets or sets which types of items should be reported through the [item click events][ItemClicked].
 * @see [shouldClick]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickableItems">Online Documentation</a>
 */
final var clickableItems: GraphItemTypes
/**
 * Gets or sets the [ContextMenuInputMode] which handles context menus on a [CanvasComponent][yfiles.view.CanvasComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23contextMenuInputMode">Online Documentation</a>
 */
final var contextMenuInputMode: ContextMenuInputMode
/**
 * Gets or sets the types of items a context menu should be queried for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23contextMenuItems">Online Documentation</a>
 */
final var contextMenuItems: GraphItemTypes
/**
 * Gets or sets the event recognizer that determines if a click should cycle through all the items that are currently under the mouse cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23cyclicSelectionRecognizer">Online Documentation</a>
 */
final var cyclicSelectionRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines if a click should select the item that is currently visible under the mouse cursor, without giving more important items higher priority.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23detailSelectionRecognizer">Online Documentation</a>
 */
final var detailSelectionRecognizer: EventRecognizer
/**
 * Gets or sets the order of the types of items that should be used to determine what item has been double-clicked or double-tapped.
 * 
 * Change this field to adjust which items will be considered when [double-clicked][ItemDoubleClicked] if there are multiple items at a given location. The default order is
 * 
 * - [GraphItemTypes.EDGE_LABEL]
 * - [GraphItemTypes.NODE_LABEL]
 * - [GraphItemTypes.PORT_LABEL]
 * - [GraphItemTypes.BEND]
 * - [GraphItemTypes.EDGE]
 * - [GraphItemTypes.NODE]
 * - [GraphItemTypes.PORT]
 * 
 * Arrays that contain strings describing the name of [GraphItemTypes] are converted to an array of [GraphItemTypes]. For example:
 * 
 * ```
 * ['node', 'edge']
 * ['NODE', 'EDGE']
 * ```
 * @see [clickSelectableItems]
 * @see [selectableItems]
 * @see [findItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23doubleClickHitTestOrder">Online Documentation</a>
 */
final var doubleClickHitTestOrder: ReadonlyArray<GraphItemTypes>
/**
 * Gets or sets the items that can be given focus via the [setCurrentItem] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23focusableItems">Online Documentation</a>
 */
final var focusableItems: GraphItemTypes
/**
 * Gets the graph instance from the [MultiplexingInputMode.inputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23graph">Online Documentation</a>
 */
open val graph: IGraph?
/**
 * Gets the graph selection from the [MultiplexingInputMode.inputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23graphSelection">Online Documentation</a>
 */
open val graphSelection: IGraphSelection?
/**
 * Gets or sets a value indicating whether void styles ([VoidNodeStyle][yfiles.styles.VoidNodeStyle], [VoidEdgeStyle][yfiles.styles.VoidEdgeStyle], [VoidLabelStyle][yfiles.styles.VoidLabelStyle], and [VoidPortStyle][yfiles.styles.VoidPortStyle]) should be ignored when selecting or focusing items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ignoreVoidStyles">Online Documentation</a>
 */
final var ignoreVoidStyles: Boolean
/**
 * Gets or sets the [ItemHoverInputMode] that is provided by this instance to detect when the cursor hovers over a graph item.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23itemHoverInputMode">Online Documentation</a>
 */
final var itemHoverInputMode: ItemHoverInputMode
/**
 * Gets or sets the [KeyboardInputMode] associated with this instance.
 * 
 * By default this input mode has a priority of `0`.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23keyboardInputMode">Online Documentation</a>
 */
final var keyboardInputMode: KeyboardInputMode
/**
 * Gets or sets the [LassoSelectionInputMode] which handles the selection of multiple elements by drawing a polygon around them.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23lassoSelectionInputMode">Online Documentation</a>
 */
final var lassoSelectionInputMode: LassoSelectionInputMode
/**
 * Gets or sets which types of items should be selected during [marquee selections][marqueeSelect] or [lasso selection][lassoSelect].
 * 
 * The default is a combination of [GraphItemTypes.NODE], [GraphItemTypes.EDGE], and [GraphItemTypes.BEND].
 * @see [shouldMarqueeSelect]
 * @see [setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23marqueeSelectableItems">Online Documentation</a>
 */
final var marqueeSelectableItems: GraphItemTypes
/**
 * Gets or sets the [MarqueeSelectionInputMode] which handles the selection of multiple elements by drawing a rectangle around them.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23marqueeSelectionInputMode">Online Documentation</a>
 */
final var marqueeSelectionInputMode: MarqueeSelectionInputMode
/**
 * Gets or sets the [MouseHoverInputMode] which is responsible for displaying Tooltips on a [CanvasComponent][yfiles.view.CanvasComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23mouseHoverInputMode">Online Documentation</a>
 */
final var mouseHoverInputMode: MouseHoverInputMode
/**
 * Gets or sets the [MoveViewportInputMode] associated with this instance.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23moveViewportInputMode">Online Documentation</a>
 */
final var moveViewportInputMode: MoveViewportInputMode
/**
 * Gets or sets the event recognizer that determines if a click is deemed a multi selection gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23multiSelectionRecognizer">Online Documentation</a>
 */
final var multiSelectionRecognizer: EventRecognizer
/**
 * Gets or sets the [NavigationInputMode] which is responsible for navigating and traversing the elements in the [IGraph].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23navigationInputMode">Online Documentation</a>
 */
final var navigationInputMode: NavigationInputMode
/**
 * Gets or sets which types of items should be selectable at all.
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23selectableItems">Online Documentation</a>
 */
final var selectableItems: GraphItemTypes
/**
 * Gets or sets a predicate that is queried to determine whether a given [IModelItem] is selectable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23selectablePredicate">Online Documentation</a>
 */
final var selectablePredicate: Predicate<IModelItem>?
/**
 * Gets or sets the [TapInputMode] which detects single and multiple taps on a [CanvasComponent][yfiles.view.CanvasComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23tapInputMode">Online Documentation</a>
 */
final var tapInputMode: TapInputMode
/**
 * Gets or sets the types of the items that should be queried a tool tip for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23toolTipItems">Online Documentation</a>
 */
final var toolTipItems: GraphItemTypes
/**
 * Gets or sets the [WaitInputMode] that is provided by this instance for those who need to make use of it.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see [WaitInputMode.waiting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23waitInputMode">Online Documentation</a>
 */
final var waitInputMode: WaitInputMode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-childInputModeContextLookup">Online Documentation</a>
 */
 override   fun <T : YObject>childInputModeContextLookup( type: YClass<T> ):T?
/**
 * Clears the selection on the current [graphSelection].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-clearSelection">Online Documentation</a>
 */
 open   fun clearSelection()
/**
 * Actually performs the click on the given item.
 * @param [item] The item that has been clicked.
 * @param [event] The original event arguments for the click. Setting its [ClickEventArgs.handled] property to `true` will indicate that the click was handled. By default this happens when the clicked item is either selected or focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-click">Online Documentation</a>
 */
 open protected   fun click( item: IModelItem ,
 event: ClickEventArgs )
/**
 * Clears the selection on click if [the click][yfiles.view.CanvasComponent.lastInputEvent] is not recognized by [multiSelectionRecognizer].
 * @param [context] The context where the click appeared
 * @return Whether the selection has been cleared by this method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-clickClearSelection">Online Documentation</a>
 */
 open protected   fun clickClearSelection( context: IInputModeContext ):Boolean
/**
 * Copies the currently selected elements to the clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-copy">Online Documentation</a>
 */
 open   fun copy()
/**
 * Factory method for the [clickInputMode] property.
 * @return a new instance of ClickInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createClickInputMode">Online Documentation</a>
 */
 open protected   fun createClickInputMode():ClickInputMode
/**
 * Factory method for the [contextMenuInputMode] property.
 * @return a new instance of ContextMenuInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createContextMenuInputMode">Online Documentation</a>
 */
 open protected   fun createContextMenuInputMode():ContextMenuInputMode
/**
 * Factory method for the [itemHoverInputMode] property.
 * @return a new instance of [itemHoverInputMode] with the [ItemHoverInputMode.hoverItems] property set to [GraphItemTypes.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createItemHoverInputMode">Online Documentation</a>
 */
 open protected   fun createItemHoverInputMode():ItemHoverInputMode
/**
 * Factory method that creates the [keyboardInputMode] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createKeyboardInputMode">Online Documentation</a>
 */
 open protected   fun createKeyboardInputMode():KeyboardInputMode
/**
 * Factory method for the [lassoSelectionInputMode] property.
 * @return a new instance of LassoSelectionInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createLassoSelectionInputMode">Online Documentation</a>
 */
 open protected   fun createLassoSelectionInputMode():LassoSelectionInputMode
/**
 * Factory method for the [marqueeSelectionInputMode] property.
 * @return a new instance of MarqueeSelectionInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createMarqueeSelectionInputMode">Online Documentation</a>
 */
 open protected   fun createMarqueeSelectionInputMode():MarqueeSelectionInputMode
/**
 * Factory method for the [MouseHoverInputMode] property.
 * @return a new instance of [MouseHoverInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createMouseHoverInputMode">Online Documentation</a>
 */
 open protected   fun createMouseHoverInputMode():MouseHoverInputMode
/**
 * Factory method for the [moveViewportInputMode] property.
 * @return a new instance of [moveViewportInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createMoveViewportInputMode">Online Documentation</a>
 */
 open protected   fun createMoveViewportInputMode():MoveViewportInputMode
/**
 * Factory method for the [navigationInputMode] property.
 * @return a new instance of NavigationInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createNavigationInputMode">Online Documentation</a>
 */
 open protected   fun createNavigationInputMode():NavigationInputMode
/**
 * Helper method that yields a suitably configured [SelectionEventArgs] using the [graphSelection] for this input mode.
 * @param [context] An input mode context that is available in the [SelectionEventArgs].
 *   Can be `null` in which case a new context for this instance is created automatically.
 * @return A selection event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createSelectionEventArgs">Online Documentation</a>
 */
 open protected   fun createSelectionEventArgs( context: IInputModeContext? ):SelectionEventArgs<IModelItem>
/**
 * Factory method for the [tapInputMode] property.
 * @return a new instance of TapInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createTapInputMode">Online Documentation</a>
 */
 open protected   fun createTapInputMode():TapInputMode
/**
 * Factory method for the [waitInputMode] property.
 * @return a new instance of [waitInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-createWaitInputMode">Online Documentation</a>
 */
 open protected   fun createWaitInputMode():WaitInputMode
/**
 * Actually performs a double-click on the given item.
 * @param [item] The item that has been double-clicked.
 * @param [event] The original event arguments for the click. Setting its [ClickEventArgs.handled] property to `true` will indicate that the double-click was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-doubleClick">Online Documentation</a>
 */
 open protected   fun doubleClick( item: IModelItem ,
 event: ClickEventArgs )
/**
 * Actually performs a double-tap on the given item.
 * @param [item] The item that has been double-tapped.
 * @param [event] The original event arguments for the tap. Setting its [TapEventArgs.handled] property to `true` will indicate that the double-tap was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-doubleTap">Online Documentation</a>
 */
 open protected   fun doubleTap( item: IModelItem ,
 event: TapEventArgs )
/**
 * Used as a callback to find the items hit underneath a certain point.
 * @param [location] The location to test.
 * @param [tests] An array of [GraphItemTypes] values that encode for which model items the hit test should be performed for prioritizing. Arrays that contain strings describing the name of [GraphItemTypes] are converted to an array of [GraphItemTypes]. For example:
 *   ```
 *   ['node', 'edge']
 *   ['NODE', 'EDGE']
 *   ```
 * @param [filter] The predicate that can be used to filter the results. May be `null`.
 * @return An enumerable over the items that have been found for the location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-findItems(Point,GraphItemTypes[],system.Predicate)">Online Documentation</a>
 */
 open   fun findItems( location: Point ,
 tests: ReadonlyArray<GraphItemTypes> ,
 filter: Predicate<IModelItem>?  = definedExternally):IEnumerable<IModelItem>
/**
 * Used as a callback to find the items hit underneath a certain point.
 * @param [context] The context to use for to the [IHitTestable.isHit] callback.
 * @param [location] The location to test.
 * @param [tests] An array of [GraphItemTypes] values that encode for which model items the hit test should be performed for prioritizing. Arrays that contain strings describing the name of [GraphItemTypes] are converted to an array of [GraphItemTypes]. For example:
 *   ```
 *   ['node', 'edge']
 *   ['NODE', 'EDGE']
 *   ```
 * @param [filter] The predicate that can be used to filter the results. May be `null`.
 * @return An enumerable over the items that have been found for the location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-findItems(IInputModeContext,Point,GraphItemTypes[],system.Predicate)">Online Documentation</a>
 */
 open   fun findItems( context: IInputModeContext ,
 location: Point ,
 tests: ReadonlyArray<GraphItemTypes> ,
 filter: Predicate<IModelItem>?  = definedExternally):IEnumerable<IModelItem>
/**
 * Called by [click] to query the `item` for an [IClickListener] in its [ILookup.lookup][yfiles.graph.ILookup.lookup] and handle it appropriately.
 * @param [context] The context for the click.
 * @param [item] The item that has been clicked.
 * @param [location] The click location.
 * @return Whether the action has been invoked and handling should be stopped.
 * @see [IClickListener]
 * @see [click]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-handleClickListener">Online Documentation</a>
 */
 open protected   fun handleClickListener( context: IInputModeContext ,
 item: IModelItem ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Performs lasso-selection with the given path.
 * @param [lassoBorder] The lasso selection path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-lassoSelect">Online Documentation</a>
 */
 final   fun lassoSelect( lassoBorder: GeneralPath )
/**
 * Performs marquee selection with the given rectangle.
 * @param [marqueeRectangle] The selection rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-marqueeSelect">Online Documentation</a>
 */
 final   fun marqueeSelect( marqueeRectangle: Rect )
/**
 * Raises the [CanvasClicked] event.
 * @param [event] The [ClickEventArgs] instance that contains the information about the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onCanvasClicked">Online Documentation</a>
 */
 open protected   fun onCanvasClicked( event: ClickEventArgs )
/**
 * Raises the [CanvasTapped] event.
 * @param [event] The [TapEventArgs] instance that contains the information about the tap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onCanvasTapped">Online Documentation</a>
 */
 open protected   fun onCanvasTapped( event: TapEventArgs )
/**
 * Called when the [clickInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onClickInputModeChanged">Online Documentation</a>
 */
 open protected   fun onClickInputModeChanged( oldMode: ClickInputMode? ,
 newMode: ClickInputMode )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 override   fun onConcurrencyControllerActivated()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 override   fun onConcurrencyControllerDeactivated()
/**
 * Called when the [ContextMenuInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onContextMenuInputModeChanged">Online Documentation</a>
 */
 open protected   fun onContextMenuInputModeChanged( oldMode: ContextMenuInputMode? ,
 newMode: ContextMenuInputMode )
/**
 * Raises the [ItemClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemClicked">Online Documentation</a>
 */
 open protected   fun onItemClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemDoubleClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemDoubleClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemDoubleTapped] event.
 * @param [event] The [ItemTappedEventArgs] instance that contains the item that has been double tapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemDoubleTapped">Online Documentation</a>
 */
 open protected   fun onItemDoubleTapped( event: ItemTappedEventArgs<IModelItem> )
/**
 * Called when the [itemHoverInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemHoverInputModeChanged">Online Documentation</a>
 */
 open protected   fun onItemHoverInputModeChanged( oldMode: ItemHoverInputMode? ,
 newMode: ItemHoverInputMode )
/**
 * Raises the [ItemLeftClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemLeftClicked">Online Documentation</a>
 */
 open protected   fun onItemLeftClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemLeftDoubleClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemLeftDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemLeftDoubleClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemRightClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemRightClicked">Online Documentation</a>
 */
 open protected   fun onItemRightClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemRightDoubleClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemRightDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemRightDoubleClicked( event: ItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemTapped] event.
 * @param [event] The [ItemTappedEventArgs] instance that contains the item that has been tapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemTapped">Online Documentation</a>
 */
 open protected   fun onItemTapped( event: ItemTappedEventArgs<IModelItem> )
/**
 * Called when the [keyboardInputMode] changed.
 * @param [oldMode] The old [keyboardInputMode].
 * @param [newMode] The new [keyboardInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onKeyboardInputModeChanged">Online Documentation</a>
 */
 open protected   fun onKeyboardInputModeChanged( oldMode: KeyboardInputMode? ,
 newMode: KeyboardInputMode )
/**
 * Performs lasso-selection with the given path.
 * @param [context] The input mode context.
 * @param [lassoBorder] The lasso selection path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onLassoSelect">Online Documentation</a>
 */
 open protected   fun onLassoSelect( context: IInputModeContext ,
 lassoBorder: GeneralPath )
/**
 * Selects the given elements in the editor inside the provided lasso-selection path.
 * @param [context] The input mode context.
 * @param [lassoBorder] The lasso path in world coordinates.
 * @param [items] The items to iterate over.
 * @param [predicate] The predicate that determines whether the provided item should be tested at all. May be `null`.
 * @see [setSelected]
 * @see [onLassoSelect]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onLassoSelectItems">Online Documentation</a>
 */
 open protected   fun onLassoSelectItems( context: IInputModeContext ,
 lassoBorder: GeneralPath ,
 items: IEnumerable<IModelItem> ,
 predicate: Predicate<IModelItem>? )
/**
 * Called when the [lassoSelectionInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onLassoSelectionInputModeChanged">Online Documentation</a>
 */
 open protected   fun onLassoSelectionInputModeChanged( oldMode: LassoSelectionInputMode? ,
 newMode: LassoSelectionInputMode )
/**
 * Performs marquee selection with the given rectangle.
 * @param [context] The input mode context.
 * @param [marqueeRectangle] The selection rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMarqueeSelect">Online Documentation</a>
 */
 open protected   fun onMarqueeSelect( context: IInputModeContext ,
 marqueeRectangle: Rect )
/**
 * Selects the given elements in the editor inside the provided marquee-selection rectangle.
 * @param [context] The input mode context.
 * @param [marqueeRectangle] The rectangle in world coordinates.
 * @param [items] The items to iterate over.
 * @param [predicate] The predicate that determines whether the provided item should be tested at all. May be `null`.
 * @see [setSelected]
 * @see [onMarqueeSelect]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMarqueeSelectItems">Online Documentation</a>
 */
 open protected   fun onMarqueeSelectItems( context: IInputModeContext ,
 marqueeRectangle: Rect ,
 items: IEnumerable<IModelItem> ,
 predicate: Predicate<IModelItem>?  = definedExternally)
/**
 * Called when the [marqueeSelectionInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMarqueeSelectionInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMarqueeSelectionInputModeChanged( oldMode: MarqueeSelectionInputMode? ,
 newMode: MarqueeSelectionInputMode )
/**
 * Called when the [MouseHoverInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMouseHoverInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMouseHoverInputModeChanged( oldMode: MouseHoverInputMode? ,
 newMode: MouseHoverInputMode )
/**
 * Called when the [moveViewportInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMoveViewportInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMoveViewportInputModeChanged( oldMode: MoveViewportInputMode? ,
 newMode: MoveViewportInputMode )
/**
 * Raises the [MultiSelectionFinished] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMultiSelectionFinished">Online Documentation</a>
 */
 open protected   fun onMultiSelectionFinished( event: SelectionEventArgs<IModelItem> )
/**
 * Raises the [MultiSelectionStarted] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMultiSelectionStarted">Online Documentation</a>
 */
 open protected   fun onMultiSelectionStarted( event: SelectionEventArgs<IModelItem> )
/**
 * Called when the [navigationInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onNavigationInputModeChanged">Online Documentation</a>
 */
 open protected   fun onNavigationInputModeChanged( oldMode: NavigationInputMode? ,
 newMode: NavigationInputMode )
/**
 * Raises the [PopulateItemContextMenu] event.
 * @param [event] The [PopulateItemContextMenuEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onPopulateItemContextMenu">Online Documentation</a>
 */
 open protected   fun onPopulateItemContextMenu( event: PopulateItemContextMenuEventArgs<IModelItem> )
/**
 * Raises the [QueryItemToolTip] event.
 * @param [event] The [QueryItemToolTipEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onQueryItemToolTip">Online Documentation</a>
 */
 open protected   fun onQueryItemToolTip( event: QueryItemToolTipEventArgs<IModelItem> )
/**
 * Called when the [tapInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onTapInputModeChanged">Online Documentation</a>
 */
 open protected   fun onTapInputModeChanged( oldMode: TapInputMode? ,
 newMode: TapInputMode )
/**
 * Called when the [waitInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onWaitInputModeChanged">Online Documentation</a>
 */
 open protected   fun onWaitInputModeChanged( oldMode: WaitInputMode? ,
 newMode: WaitInputMode )
/**
 * Clears the current selection and selects all nodes and bends in this graph.
 * @see [clearSelection]
 * @see [setSelected]
 * @see [ICommand.SELECT_ALL]
 * @see [selectableItems]
 * @see [ignoreVoidStyles]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-selectAll">Online Documentation</a>
 */
 open   fun selectAll()
/**
 * Called by this instance to set the current item on the [NavigationInputMode][NavigationInputMode.setCurrentItem]
 * @param [item] The item to set as the new "current" item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-setCurrentItem">Online Documentation</a>
 */
 open   fun setCurrentItem( item: IModelItem? )
/**
 * Uses the [graphSelection] to select the given item.
 * @param [item] The item to set the selection state on.
 * @param [selected] The new selection state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-setSelected">Online Documentation</a>
 */
 open   fun setSelected( item: IModelItem ,
 selected: Boolean )
/**
 * Called to determine whether the given `item` can be [clicked][click].
 * @param [item] The item to check.
 * @return Whether the item should be [clicked][click] in response to a detected mouse click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldClick">Online Documentation</a>
 */
 open protected   fun shouldClick( item: IModelItem ):Boolean
/**
 * Called to determine whether the given `item` should be selected when [clicked with the primary mouse button][click].
 * @param [item] The item to check.
 * @return Whether the item should be selected in response to a detected mouse click with the primary button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldClickSelect">Online Documentation</a>
 */
 open protected   fun shouldClickSelect( item: IModelItem ):Boolean
/**
 * Called to determine whether the given `item` can be [double clicked][doubleClick].
 * @param [item] The item to check.
 * @return Whether the item should be [double clicked][doubleClick] in response to a detected mouse click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldDoubleClick">Online Documentation</a>
 */
 open protected   fun shouldDoubleClick( item: IModelItem ):Boolean
/**
 * Determines whether the provided [IModelItem] should be [set to the current item][setCurrentItem].
 * @param [item] The item to check.
 * @return Whether to set the item as the current item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldFocus">Online Documentation</a>
 */
 open protected   fun shouldFocus( item: IModelItem ):Boolean
/**
 * CUsed to determine which of the built-in [ICommand]s to install.
 * @param [command] The command to install.
 * @return Whether to install this command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldInstallCommand">Online Documentation</a>
 */
 open protected   fun shouldInstallCommand( command: ICommand<*> ):Boolean
/**
 * Used by [marqueeSelect] and [lassoSelect] that takes [marqueeSelectableItems] and [shouldSelectItem] into account.
 * @param [item] The item to check.
 * @return Whether to possibly marquee or lasso select the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldMarqueeSelect">Online Documentation</a>
 */
 open protected   fun shouldMarqueeSelect( item: IModelItem ):Boolean
/**
 * Determines whether for the given item a context menu should be queried.
 * @param [item] The item to check.
 * @return Whether to raise a [PopulateItemContextMenu] event for the given item.
 * @see [contextMenuInputMode]
 * @see [ContextMenuInputMode]
 * @see [addPopulateItemContextMenuListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldPopulateContextMenu">Online Documentation</a>
 */
 open protected   fun shouldPopulateContextMenu( item: IModelItem ):Boolean
/**
 * Determines whether for the given item a tool tip should be queried.
 * @param [item] The item to check.
 * @return Whether to raise a [QueryItemToolTip] event for the given item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldQueryToolTip">Online Documentation</a>
 */
 open protected   fun shouldQueryToolTip( item: IModelItem ):Boolean
/**
 * Called as a broad classification whether an item can generally be selected.
 * @param [item] The item to check.
 * @return `true` if the item is selectable in general, `false` if not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldSelectItem">Online Documentation</a>
 */
 open protected   fun shouldSelectItem( item: IModelItem ):Boolean
/**
 * Actually performs the tap on the given item.
 * @param [item] The item that has been tapped.
 * @param [event] The original event arguments for the tap. Setting its [TapEventArgs.handled] property to `true` will indicate that the tap was handled. By default this happens when the tapped item is either selected or focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-tap">Online Documentation</a>
 */
 open protected   fun tap( item: IModelItem ,
 event: TapEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when the [context menu][ContextMenuInputMode] over an item is about to be opened to determine the contents of the context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23PopulateItemContextMenu">Online Documentation</a>
 */
fun addPopulateItemContextMenuListener(listener: EventHandler1<PopulateItemContextMenuEventArgs<IModelItem>>)
fun removePopulateItemContextMenuListener(listener: EventHandler1<PopulateItemContextMenuEventArgs<IModelItem>>)

/**
 * Occurs when the mouse is [hovering][MouseHoverInputMode] over an item to determine the tool tip to display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23QueryItemToolTip">Online Documentation</a>
 */
fun addQueryItemToolTipListener(listener: EventHandler1<QueryItemToolTipEventArgs<IModelItem>>)
fun removeQueryItemToolTipListener(listener: EventHandler1<QueryItemToolTipEventArgs<IModelItem>>)

/**
 * Occurs when an item has been clicked or tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemClicked">Online Documentation</a>
 */
fun addItemClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been left clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemLeftClicked">Online Documentation</a>
 */
fun addItemLeftClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemLeftClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been right clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemRightClicked">Online Documentation</a>
 */
fun addItemRightClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemRightClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemTapped">Online Documentation</a>
 */
fun addItemTappedListener(listener: EventHandler1<ItemTappedEventArgs<IModelItem>>)
fun removeItemTappedListener(listener: EventHandler1<ItemTappedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been double clicked.
 * @see [addItemClickedListener]
 * @see [clickableItems]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemDoubleClicked">Online Documentation</a>
 */
fun addItemDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been left double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemLeftDoubleClicked">Online Documentation</a>
 */
fun addItemLeftDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemLeftDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been right double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemRightDoubleClicked">Online Documentation</a>
 */
fun addItemRightDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)
fun removeItemRightDoubleClickedListener(listener: EventHandler1<ItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been double tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemDoubleTapped">Online Documentation</a>
 */
fun addItemDoubleTappedListener(listener: EventHandler1<ItemTappedEventArgs<IModelItem>>)
fun removeItemDoubleTappedListener(listener: EventHandler1<ItemTappedEventArgs<IModelItem>>)

/**
 * Occurs when the empty canvas area has been clicked or tapped.
 * @see [addItemClickedListener]
 * @see [addCanvasTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23CanvasClicked">Online Documentation</a>
 */
fun addCanvasClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeCanvasClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs when the empty canvas area has been tapped.
 * @see [addItemTappedListener]
 * @see [addCanvasClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23CanvasTapped">Online Documentation</a>
 */
fun addCanvasTappedListener(listener: EventHandler1<TapEventArgs>)
fun removeCanvasTappedListener(listener: EventHandler1<TapEventArgs>)

/**
 * Occurs when a single or multi select operation has been started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23MultiSelectionStarted">Online Documentation</a>
 */
fun addMultiSelectionStartedListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeMultiSelectionStartedListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs when a single or multi select operation has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23MultiSelectionFinished">Online Documentation</a>
 */
fun addMultiSelectionFinishedListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeMultiSelectionFinishedListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs when the [copy] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ElementsCopied">Online Documentation</a>
 */
fun addElementsCopiedListener(listener: EventHandler1<EventArgs>)
fun removeElementsCopiedListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<GraphInputMode> {
}
}

/**
 * Occurs when the [context menu][ContextMenuInputMode] over an item is about to be opened to determine the contents of the context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23PopulateItemContextMenu">Online Documentation</a>
 */
inline fun  GraphInputMode.addPopulateItemContextMenuHandler(
    crossinline handler: (event:PopulateItemContextMenuEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<PopulateItemContextMenuEventArgs<IModelItem>> = { _, event -> handler(event) }
    addPopulateItemContextMenuListener(listener)
    return { removePopulateItemContextMenuListener(listener) }
}
/**
 * Occurs when the mouse is [hovering][MouseHoverInputMode] over an item to determine the tool tip to display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23QueryItemToolTip">Online Documentation</a>
 */
inline fun  GraphInputMode.addQueryItemToolTipHandler(
    crossinline handler: (event:QueryItemToolTipEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryItemToolTipEventArgs<IModelItem>> = { _, event -> handler(event) }
    addQueryItemToolTipListener(listener)
    return { removeQueryItemToolTipListener(listener) }
}
/**
 * Occurs when an item has been clicked or tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemClickedListener(listener)
    return { removeItemClickedListener(listener) }
}
/**
 * Occurs when an item has been left clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemLeftClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemLeftClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemLeftClickedListener(listener)
    return { removeItemLeftClickedListener(listener) }
}
/**
 * Occurs when an item has been right clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemRightClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemRightClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemRightClickedListener(listener)
    return { removeItemRightClickedListener(listener) }
}
/**
 * Occurs when an item has been tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemTapped">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemTappedHandler(
    crossinline handler: (event:ItemTappedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemTappedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemTappedListener(listener)
    return { removeItemTappedListener(listener) }
}
/**
 * Occurs when an item has been double clicked.
 * @see [addItemClickedListener]
 * @see [clickableItems]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemDoubleClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemDoubleClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemDoubleClickedListener(listener)
    return { removeItemDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been left double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemLeftDoubleClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemLeftDoubleClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemLeftDoubleClickedListener(listener)
    return { removeItemLeftDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been right double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemRightDoubleClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemRightDoubleClickedHandler(
    crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemRightDoubleClickedListener(listener)
    return { removeItemRightDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been double tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ItemDoubleTapped">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemDoubleTappedHandler(
    crossinline handler: (event:ItemTappedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemTappedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemDoubleTappedListener(listener)
    return { removeItemDoubleTappedListener(listener) }
}
/**
 * Occurs when the empty canvas area has been clicked or tapped.
 * @see [addItemClickedListener]
 * @see [addCanvasTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23CanvasClicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addCanvasClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addCanvasClickedListener(listener)
    return { removeCanvasClickedListener(listener) }
}
/**
 * Occurs when the empty canvas area has been tapped.
 * @see [addItemTappedListener]
 * @see [addCanvasClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23CanvasTapped">Online Documentation</a>
 */
inline fun  GraphInputMode.addCanvasTappedHandler(
    crossinline handler: (event:TapEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TapEventArgs> = { _, event -> handler(event) }
    addCanvasTappedListener(listener)
    return { removeCanvasTappedListener(listener) }
}
/**
 * Occurs when a single or multi select operation has been started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23MultiSelectionStarted">Online Documentation</a>
 */
inline fun  GraphInputMode.addMultiSelectionStartedHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addMultiSelectionStartedListener(listener)
    return { removeMultiSelectionStartedListener(listener) }
}
/**
 * Occurs when a single or multi select operation has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23MultiSelectionFinished">Online Documentation</a>
 */
inline fun  GraphInputMode.addMultiSelectionFinishedHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addMultiSelectionFinishedListener(listener)
    return { removeMultiSelectionFinishedListener(listener) }
}
/**
 * Occurs when the [copy] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ElementsCopied">Online Documentation</a>
 */
inline fun  GraphInputMode.addElementsCopiedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCopiedListener(listener)
    return { removeElementsCopiedListener(listener) }
}
