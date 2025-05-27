// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.collections.IObservableCollection
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.graph.IStripe
import yfiles.graph.StripeTypes
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.view.IStripeSelection

/**
 * Input mode that can be used to interactively edit a table.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-constructor-TableEditorInputMode">Online Documentation</a>
 */
open external class TableEditorInputMode () : MultiplexingInputMode, IEventDispatcher {
  /**
   * Gets or sets a predicate that is queried to determine whether a label can be added to the given [IModelItem].
   * 
   * The default value uses the result of the [labelEditableItems][TableEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23addLabelPredicate">Online Documentation</a>
   */
  final var addLabelPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets whether the label editor will be automatically invoked if the Shift+F2 key is pressed.
   * @see [Command.ADD_LABEL]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23allowAddLabel">Online Documentation</a>
   */
  final var allowAddLabel: Boolean
  
  /**
   * Gets or sets whether the label editor will be automatically invoked if the F2 key is pressed.
   * @see [Command.EDIT_LABEL]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23allowEditLabel">Online Documentation</a>
   */
  final var allowEditLabel: Boolean
  
  /**
   * Gets or sets a value determining whether double-clicking should start label editing.
   * @see [allowEditLabel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23allowEditLabelOnDoubleClick">Online Documentation</a>
   */
  final var allowEditLabelOnDoubleClick: Boolean
  
  /**
   * Gets or sets whether to allow mixed selections of graph elements and table elements
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23allowMixedSelection">Online Documentation</a>
   */
  final var allowMixedSelection: Boolean
  
  /**
   * Gets or sets the [clickInputMode][TableEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickInputMode">Online Documentation</a>
   */
  final var clickInputMode: ClickInputMode
  
  /**
   * Gets or sets a property that determines which types of items should be selectable through [mouse clicks][TableEditorInputMode].
   * 
   * The default is [ALL][StripeTypes].
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickSelectableItems">Online Documentation</a>
   */
  final var clickSelectableItems: StripeTypes
  
  /**
   * Gets or sets clicks on which [StripeSubregionTypes](s) should toggle a stripe selection state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickSelectableRegions">Online Documentation</a>
   */
  final var clickSelectableRegions: StripeSubregionTypes
  
  /**
   * Gets or sets a property that determines for which types of items should mouse clicks be handled by this mode.
   * 
   * The default is [ALL][StripeTypes].
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickableItems">Online Documentation</a>
   */
  final var clickableItems: StripeTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether the item described by the [TableHitTestResult] can be [clicked][TableEditorInputMode].
   * 
   * The default value uses the [clickableItems][TableEditorInputMode] and [clickableRegions][TableEditorInputMode] values to determine whether the item should be clicked.
   * If this mode is installed as child mode of a [GraphEditorInputMode], it also detects clicks on labels if [GraphEditorInputMode] allows them.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickablePredicate">Online Documentation</a>
   */
  final var clickablePredicate: Predicate<TableHitTestResult>
  
  /**
   * Gets or sets clicks on which [StripeSubregionTypes](s) react to mouse clicks.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickableRegions">Online Documentation</a>
   */
  final var clickableRegions: StripeSubregionTypes
  
  /**
   * Gets or sets a property that determines which types of items may be deleted using the [deleteSelection][TableEditorInputMode] action.
   * 
   * The default is [ALL][yfiles.graph.GraphItemTypes].
   * @see [deletablePredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deletableItems">Online Documentation</a>
   */
  final var deletableItems: StripeTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether a stripe should be deleted during [deleteSelection][TableEditorInputMode].
   * 
   * The default value only allows deleting a stripe if it is not the last stripe of a given type in the table (e.g. the only row or the only column) and otherwise returns the result of the [deletableItems][TableEditorInputMode] property for the given stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deletablePredicate">Online Documentation</a>
   */
  final var deletablePredicate: Predicate<IStripe>
  
  /**
   * Gets or sets a predicate that is queried to determine whether the item described by the [TableHitTestResult] can be [double-clicked][TableEditorInputMode].
   * 
   * The default value uses the [clickablePredicate][TableEditorInputMode] to determine whether the item should be clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23doubleClickablePredicate">Online Documentation</a>
   */
  final var doubleClickablePredicate: Predicate<TableHitTestResult>
  
  /**
   * Gets or sets a predicate that is queried to determine whether the given label or a label owned by the given owner can be edited.
   * 
   * The default value uses the result of the [labelEditableItems][TableEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23editLabelPredicate">Online Documentation</a>
   */
  final var editLabelPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets a predicate that is queried by [onKeyboardInputModeChanged][TableEditorInputMode] to determine whether a built-in [Command] should be installed.
   * 
   * The default value always returns `true`.
   * @see [ClickInputMode.clicked]
   * @see [click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23installCommandPredicate">Online Documentation</a>
   */
  final var installCommandPredicate: Predicate<Command>
  
  /**
   * Gets or sets the [keyboardInputMode][TableEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23keyboardInputMode">Online Documentation</a>
   */
  final var keyboardInputMode: KeyboardInputMode
  
  /**
   * Gets or sets a property that determines which types of items may have their [labels edited][Command].
   * 
   * The default is [ALL][StripeTypes] which allows for editing the labels of all [ILabelOwner][yfiles.graph.ILabelOwner]s, and existing [ILabel][yfiles.graph.ILabel]s.
   * @see [editLabelPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23labelEditableItems">Online Documentation</a>
   */
  final var labelEditableItems: StripeTypes
  
  /**
   * Gets or sets the event recognizer that determines whether a click is deemed a multi-selection gesture.
   * 
   * The default detects the current platform and delegates either to [META_IS_DOWN][EventRecognizers] (macOS) or [CTRL_IS_DOWN][EventRecognizers] (other platforms).
   * If the [TableEditorInputMode] instance is installed as a child mode of a [GraphEditorInputMode] instance, the value of [multiSelectionRecognizer][GraphInputMode] is used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23multiSelectionRecognizer">Online Documentation</a>
   */
  final var multiSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the [reparentStripeHandler][TableEditorInputMode] property.
   * @see [ReparentStripeHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23reparentStripeHandler">Online Documentation</a>
   */
  final var reparentStripeHandler: IReparentStripeHandler
  
  /**
   * Gets or sets the [ReparentStripeInputMode] that is used to change a stripe's position in the table hierarchy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23reparentStripeInputMode">Online Documentation</a>
   */
  final var reparentStripeInputMode: ReparentStripeInputMode
  
  /**
   * Gets or sets the [ResizeStripeInputMode] that is used to change the size of a stripe interactively.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23resizeStripeInputMode">Online Documentation</a>
   */
  final var resizeStripeInputMode: ResizeStripeInputMode
  
  /**
   * Gets or sets a property that determines which types of items should be selectable at all.
   * 
   * The default is [ALL][StripeTypes].
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23selectableItems">Online Documentation</a>
   */
  final var selectableItems: StripeTypes
  
  /**
   * Gets or sets the [stripeDropInputMode][TableEditorInputMode] property that is responsible for handling drag and drop operations of stripes onto the Canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23stripeDropInputMode">Online Documentation</a>
   */
  final var stripeDropInputMode: StripeDropInputMode
  
  /**
   * Gets the [selected stripes][IStripeSelection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23stripeSelection">Online Documentation</a>
   */
  final val stripeSelection: IStripeSelection
  
  /**
   * Gets or sets a value indicating whether [stripeSelection][TableEditorInputMode] should be synchronized with the [graphSelection][GraphInputMode] if this instance is installed as a child of a [GraphEditorInputMode] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23synchronizeWithGraphSelection">Online Documentation</a>
   */
  final var synchronizeWithGraphSelection: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-childInputModeContextLookup">Online Documentation</a>
   */
  override fun childInputModeContextLookup(
    type: IClassMetadata<*>,
  ): Any?
  
  /**
   * Clears the current selection.
   * @see [selectableItems]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-clearSelection">Online Documentation</a>
   */
  open fun clearSelection()
  
  /**
   * Actually performs the [click or tap][yfiles.view.PointerEventType] on the given item.
   * @param [tableHitTestResult] Information about the item that has been clicked.
   * @param [event] The original event arguments for the click. Setting its [handled][ClickEventArgs] property to `true` will indicate that the click was handled. By default this happens when the clicked item is either selected or focused.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-click">Online Documentation</a>
   */
  protected open fun click(
    tableHitTestResult: TableHitTestResult,
    event: ClickEventArgs,
  )
  
  /**
   * Create a new instance of [IStripeSelection] the first time property [stripeSelection][TableEditorInputMode] is accessed.
   * @return A new [IStripeSelection] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createStripeSelection">Online Documentation</a>
   */
  protected open fun createStripeSelection(): IStripeSelection
  
  /**
   * This method deletes the currently selected stripes.
   * @see [deleting-selection]
   * @see [deleted-item]
   * @see [deleted-selection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-deleteSelection">Online Documentation</a>
   */
  open fun deleteSelection()
  
  /**
   * Deletes a single stripe.
   * @param [stripe] The stripe to delete.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-deleteStripe">Online Documentation</a>
   */
  open fun deleteStripe(
    stripe: IStripe,
  )
  
  /**
   * Actually performs a double click on the given item.
   * @param [tableHitTestResult] The item that has been double-clicked.
   * @param [event] The original event arguments for the click. Setting its [handled][ClickEventArgs] property to `true` will indicate that the double click was handled and events on other items in the same location are no longer raised.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-doubleClick">Online Documentation</a>
   */
  protected open fun doubleClick(
    tableHitTestResult: TableHitTestResult,
    event: ClickEventArgs,
  )
  
  /**
   * Starts label editing by executing [EDIT_LABEL][Command].
   * @param [item] The item whose label or the label itself that should be edited upon the double click gesture.
   * @return `true` iff the request was handled.
   * @see [doubleClick]
   * @see [allowEditLabelOnDoubleClick]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-editLabelOnDoubleClick">Online Documentation</a>
   */
  protected open fun editLabelOnDoubleClick(
    item: IModelItem,
  ): Boolean
  
  /**
   * Used as a callback to find the items underneath a certain point.
   * @param [location] The location to test.
   * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
   * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
   * @param [filter] Additional predicate to further restrict the hit test results.
   * @return The stripe subregions that have been found for the location or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-findStripe">Online Documentation</a>
   */
  open fun findStripe(
    location: Point,
    stripeTypes: StripeTypes,
    subregionTypes: StripeSubregionTypes,
    filter: Predicate<StripeSubregion>?  = definedExternally,
  ): StripeSubregion?
  
  /**
   * Used as a callback to find the items underneath a certain point.
   * @param [location] The location to test.
   * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
   * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
   * @param [filter] Additional predicate to further restrict the hit test results.
   * @return The stripe subregions that have been found for the location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-findStripes">Online Documentation</a>
   */
  open fun findStripes(
    location: Point,
    stripeTypes: StripeTypes,
    subregionTypes: StripeSubregionTypes,
    filter: Predicate<StripeSubregion>?  = definedExternally,
  ): IEnumerable<StripeSubregion>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-initialize">Online Documentation</a>
   */
  override fun initialize()
  
  /**
   * Inserts a new stripe as child of `owner`
   * @param [owner] The parent of the new stripe.
   * @param [index] The index where to insert the new stripe.
   * @param [size] The initial size of the stripe.
   * @return A new stripe at the given index unless `owner` is not associated with a [table][IStripe].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-insertChild">Online Documentation</a>
   */
  open fun insertChild(
    owner: IStripe,
    index: Int,
    size: Int  = definedExternally,
  ): IStripe?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called when the [clickInputMode][TableEditorInputMode] property value changes and after initialization of the field.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeChanged">Online Documentation</a>
   */
  protected open fun onClickInputModeChanged(
    oldMode: ClickInputMode?,
    newMode: ClickInputMode,
  )
  
  /**
   * Called once [clickInputMode][TableEditorInputMode] triggers the [clicked][ClickInputMode] event with [clickCount][ClickEventArgs] 1 and [pointerType][ClickEventArgs] [MOUSE][yfiles.view.PointerType].
   * @param [event] The [ClickEventArgs] of the event.
   * @param [sender] The sender of the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeClicked">Online Documentation</a>
   */
  protected open fun onClickInputModeClicked(
    event: ClickEventArgs,
    sender: IEventDispatcher,
  )
  
  /**
   * Called once [clickInputMode][TableEditorInputMode] triggers the [clicked][ClickInputMode] event with [clickCount][ClickEventArgs] 2 and [pointerType][ClickEventArgs] [MOUSE][yfiles.view.PointerType].
   * @param [event] The [ClickEventArgs] of the event.
   * @param [sender] The sender of the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeDoubleClicked">Online Documentation</a>
   */
  protected open fun onClickInputModeDoubleClicked(
    event: ClickEventArgs,
    sender: IEventDispatcher,
  )
  
  /**
   * Raises the [deleted-item][TableEditorInputMode] event.
   * @param [event] The instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletedItem">Online Documentation</a>
   */
  protected fun onDeletedItem(
    event: InputModeItemEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [deleted-selection][TableEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletedSelection">Online Documentation</a>
   */
  protected open fun onDeletedSelection(
    event: SelectionEventArgs<IStripe>,
  )
  
  /**
   * Raises the [deleting-selection][TableEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletingSelection">Online Documentation</a>
   */
  protected open fun onDeletingSelection(
    event: SelectionEventArgs<IStripe>,
  )
  
  /**
   * Raises the [item-clicked][TableEditorInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been [clicked][yfiles.view.PointerEventType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemClicked">Online Documentation</a>
   */
  protected open fun onItemClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-double-clicked][TableEditorInputMode] event.
   * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double-clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemDoubleClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-left-clicked][TableEditorInputMode] event.
   * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemLeftClicked">Online Documentation</a>
   */
  protected open fun onItemLeftClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-left-double-clicked][TableEditorInputMode] event.
   * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemLeftDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemLeftDoubleClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-right-clicked][TableEditorInputMode] event.
   * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemRightClicked">Online Documentation</a>
   */
  protected open fun onItemRightClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [item-right-double-clicked][TableEditorInputMode] event.
   * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double clicked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemRightDoubleClicked">Online Documentation</a>
   */
  protected open fun onItemRightDoubleClicked(
    event: TableItemClickedEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [keyboardInputMode][TableEditorInputMode] changed.
   * @param [oldMode] The old [keyboardInputMode][TableEditorInputMode].
   * @param [newMode] The new [keyboardInputMode][TableEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onKeyboardInputModeChanged">Online Documentation</a>
   */
  protected open fun onKeyboardInputModeChanged(
    oldMode: KeyboardInputMode?,
    newMode: KeyboardInputMode,
  )
  
  /**
   * Called when the [reparentStripeHandler][TableEditorInputMode] property value changes and after initialization of the field.
   * @param [oldHandler] the old value, which may be `null` the first time
   * @param [newHandler] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onReparentStripeHandlerChanged">Online Documentation</a>
   */
  protected open fun onReparentStripeHandlerChanged(
    oldHandler: IReparentStripeHandler?,
    newHandler: IReparentStripeHandler,
  )
  
  /**
   * Called when the [reparentStripeInputMode][TableEditorInputMode] property value changes and after initialization of the field.
   * @param [oldHandler] the old value, which may be `null` the first time
   * @param [newHandler] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onReparentStripeInputModeChanged">Online Documentation</a>
   */
  protected open fun onReparentStripeInputModeChanged(
    oldHandler: ReparentStripeInputMode?,
    newHandler: ReparentStripeInputMode,
  )
  
  /**
   * Called when the [resizeStripeInputMode][TableEditorInputMode] property value changes and after initialization of the field.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onResizeStripeInputModeChanged">Online Documentation</a>
   */
  protected open fun onResizeStripeInputModeChanged(
    oldMode: ResizeStripeInputMode?,
    newMode: ResizeStripeInputMode,
  )
  
  /**
   * Called when the [stripeDropInputMode][TableEditorInputMode] property value changes and after initialization of the field.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onStripeDropInputModeChanged">Online Documentation</a>
   */
  protected open fun onStripeDropInputModeChanged(
    oldMode: StripeDropInputMode?,
    newMode: StripeDropInputMode,
  )
  
  /**
   * Clears the current selection and selects all stripes in all table instances.
   * @see [Command.SELECT_ALL]
   * @see [selectableItems]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-selectAll">Online Documentation</a>
   */
  open fun selectAll()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<TableEditorInputMode> {
  }
}

inline fun TableEditorInputMode(
    block: TableEditorInputMode.() -> Unit
): TableEditorInputMode {
    return TableEditorInputMode()
        .apply(block)
}

/**
 * `deleting-selection`: Occurs just before the [deleteSelection][TableEditorInputMode] method starts its work and will be followed by any number of [deleted-item][TableEditorInputMode] events and finalized by a [deleted-selection][TableEditorInputMode] event.
 * @see [addDeleteSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deleting-selection">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletingSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IStripe>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IStripe>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("deleting-selection", listener)
  return { removeEventListener("deleting-selection", listener) }
}

/**
 * `deleted-item`: Occurs when an item has been deleted interactively by this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deleted-item">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletedItemHandler(
  crossinline handler: (event:InputModeItemEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("deleted-item", listener)
  return { removeEventListener("deleted-item", listener) }
}

/**
 * `deleted-selection`: Occurs after all selected items have been removed in [deleteSelection][TableEditorInputMode].
 * @see [addDeleteSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deleted-selection">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletedSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IStripe>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IStripe>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("deleted-selection", listener)
  return { removeEventListener("deleted-selection", listener) }
}

/**
 * `item-clicked`: Occurs when an item has been clicked or tapped.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemLeftClickedHandler]
 * @see [addItemRightClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-clicked", listener)
  return { removeEventListener("item-clicked", listener) }
}

/**
 * `item-left-clicked`: Occurs when an item has been left clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemClickedHandler]
 * @see [addItemRightClickedHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-left-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemLeftClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-left-clicked", listener)
  return { removeEventListener("item-left-clicked", listener) }
}

/**
 * `item-right-clicked`: Occurs when an item has been right clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemClickedHandler]
 * @see [addItemLeftClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-right-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemRightClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-right-clicked", listener)
  return { removeEventListener("item-right-clicked", listener) }
}

/**
 * `item-double-clicked`: Occurs when an item has been double-clicked or double-tapped.
 * @see [addItemClickedHandler]
 * @see [addClickableItemsHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-double-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemDoubleClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-double-clicked", listener)
  return { removeEventListener("item-double-clicked", listener) }
}

/**
 * `item-left-double-clicked`: Occurs when an item has been left double clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemRightDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-left-double-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemLeftDoubleClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-left-double-clicked", listener)
  return { removeEventListener("item-left-double-clicked", listener) }
}

/**
 * `item-right-double-clicked`: Occurs when an item has been right double clicked.
 * @see [addClickableItemsHandler]
 * @see [addItemDoubleClickedHandler]
 * @see [addItemLeftDoubleClickedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23item-right-double-clicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemRightDoubleClickedHandler(
  crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { event, _ -> handler(event) }
  addEventListener("item-right-double-clicked", listener)
  return { removeEventListener("item-right-double-clicked", listener) }
}
