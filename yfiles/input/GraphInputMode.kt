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
import yfiles.collections.IEnumerable
import yfiles.collections.IObservableCollection
import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.GraphItemTypes
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.view.IGraphSelection

/**
 * Abstract base class for [GraphViewerInputMode] and [GraphEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode">Online Documentation</a>
 */
abstract external class GraphInputMode  : MultiplexingInputMode, IEventDispatcher {
  /**
   * Gets or sets a property that determines whether clipboard operations with the usual shortcuts are enabled on the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23allowClipboardOperations">Online Documentation</a>
   */
  final var allowClipboardOperations: Boolean
  
  /**
   * Gets a collection of commands that this input mode will handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23availableCommands">Online Documentation</a>
   */
  final val availableCommands: IObservableCollection<Command>
  
  /**
   * Gets or sets the order of the types of items that should be used to determine what item has been clicked or tapped.
   * 
   * Change this field to adjust which items will be [selected][GraphInputMode] if there are multiple items at a given location. The default order is the Z-Order but with a prioritization for elements behind labels. [shouldSkipHitLabel][GraphInputMode].
   * 
   * - [ALL][GraphItemTypes]
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
   * @see [onItemClicked]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickInputMode">Online Documentation</a>
   */
  final var clickInputMode: ClickInputMode
  
  /**
   * Gets or sets which types of items should be selectable by mouse clicks.
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [clickSelectablePredicate]
   * @see [setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickSelectableItems">Online Documentation</a>
   */
  final var clickSelectableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item should be selected when [clicked with the primary mouse button][GraphInputMode].
   * 
   * The default value returns the result of [selectablePredicate][GraphInputMode] and the [clickSelectableItems][GraphInputMode] property for the given item.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickSelectablePredicate">Online Documentation</a>
   */
  final var clickSelectablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets which types of items should be reported through the [item click events][GraphInputMode].
   * @see [clickablePredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickableItems">Online Documentation</a>
   */
  final var clickableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item can be [clicked][GraphInputMode].
   * 
   * The default value returns the result of the [clickableItems][GraphInputMode] property for the given item.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23clickablePredicate">Online Documentation</a>
   */
  final var clickablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the [ContextMenuInputMode] which handles context menus on a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23contextMenuInputMode">Online Documentation</a>
   */
  final var contextMenuInputMode: ContextMenuInputMode
  
  /**
   * Gets or sets the types of items a context menu should be queried for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23contextMenuItems">Online Documentation</a>
   */
  final var contextMenuItems: GraphItemTypes
  
  /**
   * Gets or sets the event recognizer that determines if a [click or tap][yfiles.view.PointerEventType] should cycle through all the items that are currently under the mouse cursor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23cyclicSelectionRecognizer">Online Documentation</a>
   */
  final var cyclicSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines if a [click or tap][yfiles.view.PointerEventType] should select the item that is currently visible under the pointer cursor, without giving more important items higher priority.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23detailSelectionRecognizer">Online Documentation</a>
   */
  final var detailSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the order of the types of items that should be used to determine what item has been double-clicked or double-tapped.
   * 
   * Change this field to adjust which items will be considered when [double-clicked][GraphInputMode] if there are multiple items at a given location. The default order is
   * 
   * - [ALL][GraphItemTypes]
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
   * Gets or sets a predicate that is queried to determine whether an item can be [double clicked][GraphInputMode].
   * 
   * The default value returns the result of the [clickablePredicate][GraphInputMode] property for the given item.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23doubleClickablePredicate">Online Documentation</a>
   */
  final var doubleClickablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the items that can be given focus via the [setCurrentItem][GraphInputMode] method.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23focusableItems">Online Documentation</a>
   */
  final var focusableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item should be [set to the current item][GraphInputMode].
   * 
   * The default value returns the result of the [focusableItems][GraphInputMode] property for the given item. It also honors the [ignoreVoidStyles][GraphInputMode] property.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23focusablePredicate">Online Documentation</a>
   */
  final var focusablePredicate: Predicate<IModelItem>
  
  /**
   * Gets the graph instance from the [parentInputModeContext][MultiplexingInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23graph">Online Documentation</a>
   */
  open val graph: IGraph?
  
  /**
   * Gets the graph selection from the [parentInputModeContext][MultiplexingInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23graphSelection">Online Documentation</a>
   */
  open val graphSelection: IGraphSelection?
  
  /**
   * Gets or sets the hitTester property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23hitTester">Online Documentation</a>
   */
  final var hitTester: IHitTester
  
  /**
   * Gets or sets a value indicating whether void styles should be ignored when selecting or focusing items.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23ignoreVoidStyles">Online Documentation</a>
   */
  final var ignoreVoidStyles: Boolean
  
  /**
   * Gets or sets the [ItemHoverInputMode] that is provided by this instance to detect when the cursor hovers over a graph item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23itemHoverInputMode">Online Documentation</a>
   */
  final var itemHoverInputMode: ItemHoverInputMode
  
  /**
   * Gets or sets the [KeyboardInputMode] associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23keyboardInputMode">Online Documentation</a>
   */
  final var keyboardInputMode: KeyboardInputMode
  
  /**
   * Gets or sets the [LassoSelectionInputMode] which handles the selection of multiple elements by drawing a polygon around them.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23lassoSelectionInputMode">Online Documentation</a>
   */
  final var lassoSelectionInputMode: LassoSelectionInputMode
  
  /**
   * Gets or sets which types of items should be selected during [marquee selections][GraphInputMode] or [lasso selection][GraphInputMode].
   * 
   * The default is a combination of [NODE][GraphItemTypes], [EDGE][GraphItemTypes], and [BEND][GraphItemTypes].
   * @see [marqueeSelectablePredicate]
   * @see [setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23marqueeSelectableItems">Online Documentation</a>
   */
  final var marqueeSelectableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item can be selected by [marquee][GraphInputMode] or [lasso][GraphInputMode] selection.
   * 
   * The default value returns the result of the [marqueeSelectableItems][GraphInputMode] property for the given item and takes [selectablePredicate][GraphInputMode] into account.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23marqueeSelectablePredicate">Online Documentation</a>
   */
  final var marqueeSelectablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the [MarqueeSelectionInputMode] which handles the selection of multiple elements by drawing a rectangle around them.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23marqueeSelectionInputMode">Online Documentation</a>
   */
  final var marqueeSelectionInputMode: MarqueeSelectionInputMode
  
  /**
   * Gets or sets the [MoveViewportInputMode] associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23moveViewportInputMode">Online Documentation</a>
   */
  final var moveViewportInputMode: MoveViewportInputMode
  
  /**
   * Gets or sets the event recognizer that determines if a [click or tap][yfiles.view.PointerEventType] is deemed a multi-selection gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23multiSelectionRecognizer">Online Documentation</a>
   */
  final var multiSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the [NavigationInputMode] which is responsible for navigating and traversing the elements in the [IGraph].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23navigationInputMode">Online Documentation</a>
   */
  final var navigationInputMode: NavigationInputMode
  
  /**
   * Gets or sets a predicate that is queried to determine whether a context menu should be shown for an item.
   * 
   * The default value returns the result of the [contextMenuItems][GraphInputMode] property for the given item.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23populateContextMenuPredicate">Online Documentation</a>
   */
  final var populateContextMenuPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets a predicate that is queried to determine whether a tool tip should be queried for an item.
   * 
   * The default value returns the result of the [toolTipItems][GraphInputMode] property for the given item.
   * @see [query-item-tool-tip]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23queryToolTipPredicate">Online Documentation</a>
   */
  final var queryToolTipPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets which types of items should be selectable at all.
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23selectableItems">Online Documentation</a>
   */
  final var selectableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether a given [IModelItem] is selectable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23selectablePredicate">Online Documentation</a>
   */
  final var selectablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets a value that specifies whether during hit testing, labels [should be skipped][GraphInputMode] at all.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23skipHitLabels">Online Documentation</a>
   */
  final var skipHitLabels: Boolean
  
  /**
   * Gets or sets the [toolTipInputMode][GraphInputMode] which is responsible for displaying Tooltips on a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23toolTipInputMode">Online Documentation</a>
   */
  final var toolTipInputMode: ToolTipInputMode
  
  /**
   * Gets or sets the types of the items that should be queried for a tooltip.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23toolTipItems">Online Documentation</a>
   */
  final var toolTipItems: GraphItemTypes
  
  /**
   * Gets or sets the [WaitInputMode] that is provided by this instance for those who need to make use of it.
   * @see [WaitInputMode.waiting]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23waitInputMode">Online Documentation</a>
   */
  final var waitInputMode: WaitInputMode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-childInputModeContextLookup">Online Documentation</a>
   */
  override fun childInputModeContextLookup(
    type: IClassMetadata<*>,
  ): Any?
  
  /**
   * Clears the selection on the current [graphSelection][GraphInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-clearSelection">Online Documentation</a>
   */
  open fun clearSelection()
  
  /**
   * Actually performs the [click or tap][yfiles.view.PointerEventType] on the given item.
   * @param [item] The item that has been clicked.
   * @param [event] The original event arguments for the click. Setting its [handled][ClickEventArgs] property to `true` will indicate that the click was handled. By default, this happens when the clicked item is either selected or focused.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-click">Online Documentation</a>
   */
  protected open fun click(
    item: IModelItem,
    event: ClickEventArgs,
  )
  
  /**
   * Clears the selection on click if [the click][yfiles.view.CanvasComponent] is not recognized by [multiSelectionRecognizer][GraphInputMode].
   * @param [context] The context where the click appeared.
   * @return Whether the selection has been cleared by this method.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-clickClearSelection">Online Documentation</a>
   */
  protected open fun clickClearSelection(
    context: IInputModeContext,
  ): Boolean
  
  /**
   * Copies the currently selected elements to the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-copy">Online Documentation</a>
   */
  open fun copy()
  
  /**
   * Actually performs a double-tap on the given item.
   * @param [item] The item that has been double-clicked.
   * @param [event] The original event arguments for the click. Setting its [handled][ClickEventArgs] property to `true` will indicate that the double-click was handled and events on other items in the same location are no longer raised.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-doubleClick">Online Documentation</a>
   */
  protected open fun doubleClick(
    item: IModelItem,
    event: ClickEventArgs,
  )
  
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
  open fun findItems(
    location: Point,
    tests: ReadonlyArray<GraphItemTypes>,
    filter: Predicate<IModelItem>?  = definedExternally,
  ): IEnumerable<IModelItem>
  
  /**
   * Used as a callback to find the items hit underneath a certain point.
   * @param [context] The context to use for the [isHit][IHitTestable] callback.
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
  open fun findItems(
    context: IInputModeContext,
    location: Point,
    tests: ReadonlyArray<GraphItemTypes>,
    filter: Predicate<IModelItem>?  = definedExternally,
  ): IEnumerable<IModelItem>
  
  /**
   * Called by [click][GraphInputMode] to query the `item` for an [IClickListener] in its [lookup][yfiles.collections.ILookup] and handle it appropriately.
   * @param [context] The context for the click.
   * @param [item] The item that has been clicked.
   * @param [location] The click location.
   * @return Whether the action has been invoked and handling should be stopped.
   * @see [IClickListener]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-handleClickListener">Online Documentation</a>
   */
  protected open fun handleClickListener(
    context: IInputModeContext,
    item: IModelItem,
    location: Point,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Performs lasso-selection with the given path.
   * @param [lassoPath] The lasso selection path.
   * @param [selectionPolicy] The policy to use for changing the selection of the elements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-lassoSelect">Online Documentation</a>
   */
  fun lassoSelect(
    lassoPath: GeneralPath,
    selectionPolicy: SelectionPolicy  = definedExternally,
  )
  
  /**
   * Performs marquee selection with the given rectangle.
   * @param [marqueeRectangle] The selection rectangle.
   * @param [selectionPolicy] The policy to use for changing the selection of the elements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-marqueeSelect">Online Documentation</a>
   */
  fun marqueeSelect(
    marqueeRectangle: Rect,
    selectionPolicy: SelectionPolicy  = definedExternally,
  )
  
  /**
   * Raises the [canvas-clicked][GraphInputMode] event.
   * @param [event] The [ClickEventArgs] instance that contains the information about the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onCanvasClicked">Online Documentation</a>
   */
  protected open fun onCanvasClicked(
    event: ClickEventArgs,
  )
  
  /**
   * Called when the [clickInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onClickInputModeChanged">Online Documentation</a>
   */
  protected open fun onClickInputModeChanged(
    oldMode: ClickInputMode?,
    newMode: ClickInputMode,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  override fun onConcurrencyControllerDeactivated()
  
  /**
   * Called when the [ContextMenuInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onContextMenuInputModeChanged">Online Documentation</a>
   */
  protected open fun onContextMenuInputModeChanged(
    oldMode: ContextMenuInputMode?,
    newMode: ContextMenuInputMode,
  )
  
  /**
   * Raises the [item-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been [clicked][yfiles.view.PointerEventType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemClicked">Online Documentation</a>
   */
  protected open fun onItemClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-double-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double-[clicked][yfiles.view.PointerEventType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemDoubleClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [itemHoverInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemHoverInputModeChanged">Online Documentation</a>
   */
  protected open fun onItemHoverInputModeChanged(
    oldMode: ItemHoverInputMode?,
    newMode: ItemHoverInputMode,
  )
  
  /**
   * Raises the [item-left-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemLeftClicked">Online Documentation</a>
   */
  protected open fun onItemLeftClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-left-double-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double-clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemLeftDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemLeftDoubleClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-right-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemRightClicked">Online Documentation</a>
   */
  protected open fun onItemRightClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-right-double-clicked][GraphInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been double clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onItemRightDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemRightDoubleClicked(
    event: ItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [keyboardInputMode][GraphInputMode] changes.
   * @param [oldMode] The old [keyboardInputMode][GraphInputMode].
   * @param [newMode] The new [keyboardInputMode][GraphInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onKeyboardInputModeChanged">Online Documentation</a>
   */
  protected open fun onKeyboardInputModeChanged(
    oldMode: KeyboardInputMode?,
    newMode: KeyboardInputMode,
  )
  
  /**
   * Performs lasso-selection with the given path.
   * @param [context] The input mode context.
   * @param [lassoPath] The lasso selection path.
   * @param [selectionPolicy] The policy to use for changing the selection of the elements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onLassoSelect">Online Documentation</a>
   */
  protected open fun onLassoSelect(
    context: IInputModeContext,
    lassoPath: GeneralPath,
    selectionPolicy: SelectionPolicy,
  )
  
  /**
   * Called when the [lassoSelectionInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onLassoSelectionInputModeChanged">Online Documentation</a>
   */
  protected open fun onLassoSelectionInputModeChanged(
    oldMode: LassoSelectionInputMode?,
    newMode: LassoSelectionInputMode,
  )
  
  /**
   * Performs marquee selection with the given rectangle.
   * @param [context] The input mode context.
   * @param [marqueeRectangle] The selection rectangle.
   * @param [selectionPolicy] The policy for changing the selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMarqueeSelect">Online Documentation</a>
   */
  protected open fun onMarqueeSelect(
    context: IInputModeContext,
    marqueeRectangle: Rect,
    selectionPolicy: SelectionPolicy,
  )
  
  /**
   * Called when the [marqueeSelectionInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMarqueeSelectionInputModeChanged">Online Documentation</a>
   */
  protected open fun onMarqueeSelectionInputModeChanged(
    oldMode: MarqueeSelectionInputMode?,
    newMode: MarqueeSelectionInputMode,
  )
  
  /**
   * Called when the [moveViewportInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMoveViewportInputModeChanged">Online Documentation</a>
   */
  protected open fun onMoveViewportInputModeChanged(
    oldMode: MoveViewportInputMode?,
    newMode: MoveViewportInputMode,
  )
  
  /**
   * Raises the [multi-selection-finished][GraphInputMode] event.
   * @param [event] The [SelectionEventArgs] that provides the selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMultiSelectionFinished">Online Documentation</a>
   */
  protected open fun onMultiSelectionFinished(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [multi-selection-started][GraphInputMode] event.
   * @param [event] The [SelectionEventArgs] that provides the selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onMultiSelectionStarted">Online Documentation</a>
   */
  protected open fun onMultiSelectionStarted(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [navigationInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onNavigationInputModeChanged">Online Documentation</a>
   */
  protected open fun onNavigationInputModeChanged(
    oldMode: NavigationInputMode?,
    newMode: NavigationInputMode,
  )
  
  /**
   * Raises the [populate-item-context-menu][GraphInputMode] event.
   * @param [event] The [PopulateItemContextMenuEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onPopulateItemContextMenu">Online Documentation</a>
   */
  protected open fun onPopulateItemContextMenu(
    event: PopulateItemContextMenuEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [query-item-tool-tip][GraphInputMode] event.
   * @param [event] The [QueryItemToolTipEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onQueryItemToolTip">Online Documentation</a>
   */
  protected open fun onQueryItemToolTip(
    event: QueryItemToolTipEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [toolTipInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onToolTipInputModeChanged">Online Documentation</a>
   */
  protected open fun onToolTipInputModeChanged(
    oldMode: ToolTipInputMode?,
    newMode: ToolTipInputMode,
  )
  
  /**
   * Called when the [waitInputMode][GraphInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-onWaitInputModeChanged">Online Documentation</a>
   */
  protected open fun onWaitInputModeChanged(
    oldMode: WaitInputMode?,
    newMode: WaitInputMode,
  )
  
  /**
   * Clears the current selection and selects all nodes and bends in this graph.
   * @see [clearSelection]
   * @see [setSelected]
   * @see [Command.SELECT_ALL]
   * @see [selectableItems]
   * @see [ignoreVoidStyles]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-selectAll">Online Documentation</a>
   */
  open fun selectAll()
  
  /**
   * Called by this instance to set the current item on the [NavigationInputMode]
   * @param [item] The item to set as the new "current" item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-setCurrentItem">Online Documentation</a>
   */
  open fun setCurrentItem(
    item: IModelItem?,
  )
  
  /**
   * Uses the [graphSelection][GraphInputMode] to select the given item.
   * @param [item] The item to set the selection state on.
   * @param [selected] The new selection state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-setSelected">Online Documentation</a>
   */
  open fun setSelected(
    item: IModelItem,
    selected: Boolean,
  )
  
  /**
   * Callback function that is used during hit testing, when an [ILabel] was hit tested before another non-label underneath it was reported.
   * @param [context] The context in which the hit testing is performed.
   * @param [hitLabel] The label that was hit before a non-label at the same location.
   * @param [location] The location the label was hit.
   * @return Whether to first report the non-label during hit testing.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-shouldSkipHitLabel">Online Documentation</a>
   */
  protected open fun shouldSkipHitLabel(
    context: IInputModeContext,
    hitLabel: ILabel,
    location: Point,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23GraphInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<GraphInputMode> {
  }
}

/**
 * `populate-item-context-menu`: Occurs when the [context menu][ContextMenuInputMode] over an item is about to be opened to determine the contents of the context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23populate-item-context-menu">Online Documentation</a>
 */
inline fun  GraphInputMode.addPopulateItemContextMenuHandler(
  crossinline handler: (event:PopulateItemContextMenuEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<PopulateItemContextMenuEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("populate-item-context-menu", listener)
  return { removeEventListener("populate-item-context-menu", listener) }
}

/**
 * `query-item-tool-tip`: Occurs when the mouse is [hovering][GraphInputMode] over an item to determine the tool tip to display.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23query-item-tool-tip">Online Documentation</a>
 */
inline fun  GraphInputMode.addQueryItemToolTipHandler(
  crossinline handler: (event:QueryItemToolTipEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryItemToolTipEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("query-item-tool-tip", listener)
  return { removeEventListener("query-item-tool-tip", listener) }
}

/**
 * `item-clicked`: Occurs when an item has been clicked or tapped.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemLeftClickedHandler]
 * @see [addItemRightClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-clicked", listener)
  return { removeEventListener("item-clicked", listener) }
}

/**
 * `item-left-clicked`: Occurs when an item has been left-clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemClickedHandler]
 * @see [addItemRightClickedHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-left-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemLeftClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-left-clicked", listener)
  return { removeEventListener("item-left-clicked", listener) }
}

/**
 * `item-right-clicked`: Occurs when an item has been right-clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemClickedHandler]
 * @see [addItemLeftClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-right-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemRightClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-right-clicked", listener)
  return { removeEventListener("item-right-clicked", listener) }
}

/**
 * `item-double-clicked`: Occurs when an item has been double-clicked or double-tapped.
 * @see [addItemClickedHandler]
 * @see [addClickableItemsHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-double-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemDoubleClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-double-clicked", listener)
  return { removeEventListener("item-double-clicked", listener) }
}

/**
 * `item-left-double-clicked`: Occurs when an item has been left double-clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-left-double-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemLeftDoubleClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-left-double-clicked", listener)
  return { removeEventListener("item-left-double-clicked", listener) }
}

/**
 * `item-right-double-clicked`: Occurs when an item has been right double-clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23item-right-double-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemRightDoubleClickedHandler(
  crossinline handler: (event:ItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-right-double-clicked", listener)
  return { removeEventListener("item-right-double-clicked", listener) }
}

/**
 * `canvas-clicked`: Occurs when the empty canvas area has been clicked or tapped.
 * @see [addItemClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23canvas-clicked">Online Documentation</a>
 */
inline fun  GraphInputMode.addCanvasClickedHandler(
  crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ClickEventArgs> = { event, _ -> handler(event) }
  addEventListener("canvas-clicked", listener)
  return { removeEventListener("canvas-clicked", listener) }
}

/**
 * `multi-selection-started`: Occurs when a single or multi select operation has been started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23multi-selection-started">Online Documentation</a>
 */
inline fun  GraphInputMode.addMultiSelectionStartedHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("multi-selection-started", listener)
  return { removeEventListener("multi-selection-started", listener) }
}

/**
 * `multi-selection-finished`: Occurs when a single or multi select operation has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23multi-selection-finished">Online Documentation</a>
 */
inline fun  GraphInputMode.addMultiSelectionFinishedHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("multi-selection-finished", listener)
  return { removeEventListener("multi-selection-finished", listener) }
}

/**
 * `items-copied`: Occurs when the [copy][GraphInputMode] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphInputMode%23items-copied">Online Documentation</a>
 */
inline fun  GraphInputMode.addItemsCopiedHandler(
  crossinline handler: (event:ItemsEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemsEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-copied", listener)
  return { removeEventListener("items-copied", listener) }
}
