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
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Point
import yfiles.graph.ILabel
import yfiles.graph.ILabelOwner
import yfiles.graph.IModelItem
import yfiles.graph.IStripe
import yfiles.graph.LabelEventArgs
import yfiles.graph.StripeTypes
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.ISelectionModel
import yfiles.view.IStripeSelection

/**
 * Input mode that can be used to interactively edit a table.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode">Online Documentation</a>
 * 
 * @constructor Default constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-constructor-TableEditorInputMode">Online Documentation</a>
 */
external open class TableEditorInputMode  () : MultiplexingInputMode, IEventDispatcher {

/**
 * Gets or sets whether the label editor will be automatically invoked if the Shift+F2 key is pressed.
 * @see [createLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23allowAddLabel">Online Documentation</a>
 */
final var allowAddLabel: Boolean
/**
 * Gets or sets whether the label editor will be automatically invoked if the F2 key is pressed.
 * @see [editLabel]
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
 * Gets or sets a value indicating whether this mode should automatically [remove labels][yfiles.graph.ITable.remove] from the table when a label text has been edited and the label text is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23autoRemoveEmptyLabels">Online Documentation</a>
 */
final var autoRemoveEmptyLabels: Boolean
/**
 * Gets or sets the [clickInputMode].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickInputMode">Online Documentation</a>
 */
final var clickInputMode: ClickInputMode
/**
 * Gets or set a property that determines which types of items should be selectable through [mouse clicks.][onClickInputModeClicked].
 * 
 * The default is [StripeTypes.ALL].
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
 * Gets or set a property that determines for which types of items should mouse clicks be handled by this mode.
 * 
 * The default is [StripeTypes.ALL].
 * @see [GraphInputMode.setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickableItems">Online Documentation</a>
 */
final var clickableItems: StripeTypes
/**
 * Gets or sets clicks on which [StripeSubregionTypes](s) react to mouse clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23clickableRegions">Online Documentation</a>
 */
final var clickableRegions: StripeSubregionTypes
/**
 * Gets or set a property that determines which types of items may be deleted using the [deleteSelection] action.
 * 
 * The default is [GraphItemTypes.ALL][yfiles.graph.GraphItemTypes.ALL].
 * @see [shouldDelete]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23deletableItems">Online Documentation</a>
 */
final var deletableItems: StripeTypes
/**
 * Gets or sets the [keyboardInputMode].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23keyboardInputMode">Online Documentation</a>
 */
final var keyboardInputMode: KeyboardInputMode
/**
 * Gets or set a property that determines which types of items may have their [labels edited][editLabel].
 * 
 * The default is [StripeTypes.ALL] which allows for editing the labels of all [ILabelOwner]s, and existing [ILabel]s.
 * @see [shouldEditLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23labelEditableItems">Online Documentation</a>
 */
final var labelEditableItems: StripeTypes
/**
 * Gets or sets the event recognizer that determines whether a click is deemed a multi selection gesture.
 * 
 * The default is a combination of [KeyEventRecognizers.CTRL_IS_DOWN] or [KeyEventRecognizers.META_IS_DOWN].
 * If the [TableEditorInputMode] instance is installed as child mode of a [GraphEditorInputMode] instance, the value of [GraphInputMode.multiSelectionRecognizer] is used instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23multiSelectionRecognizer">Online Documentation</a>
 */
final var multiSelectionRecognizer: EventRecognizer
/**
 * Gets or sets the [reparentStripeHandler] property.
 * @see [ReparentStripeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23reparentStripeHandler">Online Documentation</a>
 */
final var reparentStripeHandler: IReparentStripeHandler
/**
 * Gets or sets the [ReparentStripeInputMode] that is used to change a stripes position in the table hierarchy.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23reparentStripeInputMode">Online Documentation</a>
 */
final var reparentStripeInputMode: ReparentStripeInputMode
/**
 * Gets or sets the [ResizeStripeInputMode] that is used to change the size of a stripe interactively.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23resizeStripeInputMode">Online Documentation</a>
 */
final var resizeStripeInputMode: ResizeStripeInputMode
/**
 * Gets or set a property that determines which types of items should be selectable at all.
 * 
 * The default is [StripeTypes.ALL].
 * @see [GraphInputMode.setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23selectableItems">Online Documentation</a>
 */
final var selectableItems: StripeTypes
/**
 * Gets or sets the [stripeDropInputMode] property that is responsible for handling drag and drop operations of stripes onto the Canvas.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23stripeDropInputMode">Online Documentation</a>
 */
final var stripeDropInputMode: StripeDropInputMode
/**
 * Gets the [selected stripes][IStripeSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23stripeSelection">Online Documentation</a>
 */
final val stripeSelection: IStripeSelection
/**
 * Gets or sets a value indicating whether [stripeSelection] should be synchronized with the [GraphInputMode.graphSelection] if this instance is installed as a child of a [GraphEditorInputMode] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23synchronizeWithGraphSelection">Online Documentation</a>
 */
final var synchronizeWithGraphSelection: Boolean
/**
 * Gets or sets the [textEditorInputMode].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23textEditorInputMode">Online Documentation</a>
 */
final var textEditorInputMode: TextEditorInputMode
/**
 * Adds a new label to the given stripe interactively.
 * @param [owner] The item.
 * @return A Promise that fulfills with either the newly created label or `null` if the [editing was canceled][TextEditorInputMode.EditingCanceled] or the text did not [validate][ValidateLabelText].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-addLabel">Online Documentation</a>
 */
 open   fun addLabel( owner: ILabelOwner ):Promise<ILabel?>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-childInputModeContextLookup">Online Documentation</a>
 */
 override   fun <T : YObject>childInputModeContextLookup( type: YClass<T> ):T?
/**
 * Clears the current selection.
 * @see [selectableItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-clearSelection">Online Documentation</a>
 */
 open   fun clearSelection()
/**
 * Actually performs the click on the given item.
 * @param [tableHitTestResult] Information about the item that has been clicked.
 * @param [event] The original event arguments for the click. Setting its [ClickEventArgs.handled] property to `true` will indicate that the click was handled. By default this happens when the clicked item is either selected or focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-click">Online Documentation</a>
 */
 open protected   fun click( tableHitTestResult: TableHitTestResult ,
 event: ClickEventArgs )
/**
 * Factory method that creates the [keyboardInputMode] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createClickInputMode">Online Documentation</a>
 */
 open protected   fun createClickInputMode():ClickInputMode
/**
 * Factory method that creates the [keyboardInputMode] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createKeyboardInputMode">Online Documentation</a>
 */
 open protected   fun createKeyboardInputMode():KeyboardInputMode
/**
 * Interactively creates a new label for the provided stripe.
 * @param [stripe] The item to create a new label for.
 * @return A Promise for the label that will be resolved with the newly created label or a `null` if the creation was canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createLabel">Online Documentation</a>
 */
 open   fun createLabel( stripe: IStripe ):Promise<ILabel?>
/**
 * Factory method for the [reparentStripeHandler] property.
 * @return a new instance of [IReparentStripeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createReparentStripeHandler">Online Documentation</a>
 */
 open protected   fun createReparentStripeHandler():IReparentStripeHandler
/**
 * Factory method that creates the [reparentStripeInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [ReparentStripeInputMode] type, which is initially [enabled][MoveInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createReparentStripeInputMode">Online Documentation</a>
 */
 open protected   fun createReparentStripeInputMode():ReparentStripeInputMode
/**
 * Factory method that creates the [resizeStripeInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [ResizeStripeInputMode] type, which is initially [enabled][ResizeStripeInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createResizeStripeInputMode">Online Documentation</a>
 */
 open protected   fun createResizeStripeInputMode():ResizeStripeInputMode
/**
 * Factory method that creates the [stripeDropInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [StripeDropInputMode] type, which is initially [disabled][DropInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createStripeDropInputMode">Online Documentation</a>
 */
 open protected   fun createStripeDropInputMode():StripeDropInputMode
/**
 * Create a new instance of [IStripeSelection] the first time property [stripeSelection] is accessed.
 * @return A new [IStripeSelection] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createStripeSelection">Online Documentation</a>
 */
 open protected   fun createStripeSelection():IStripeSelection
/**
 * Factory method for the [textEditorInputMode] property.
 * @return a new instance of [TextEditorInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-createTextEditorInputMode">Online Documentation</a>
 */
 open protected   fun createTextEditorInputMode():TextEditorInputMode
/**
 * This method deletes the currently selected stripes.
 * @see [addDeletingSelectionListener]
 * @see [addDeletedItemListener]
 * @see [addDeletedSelectionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-deleteSelection">Online Documentation</a>
 */
 open   fun deleteSelection()
/**
 * Deletes a single stripe
 * @param [stripe] The stripe to delete.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-deleteStripe">Online Documentation</a>
 */
 open   fun deleteStripe( stripe: IStripe )
/**
 * Actually performs a double-click on the given item.
 * @param [tableHitTestResult] The item that has been double-clicked.
 * @param [event] The original event arguments for the click. Setting its [ClickEventArgs.handled] property to `true` will indicate that the double-click was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-doubleClick">Online Documentation</a>
 */
 open protected   fun doubleClick( tableHitTestResult: TableHitTestResult ,
 event: ClickEventArgs )
/**
 * Actually performs a double-tap on the given item.
 * @param [tableHitTestResult] The item that has been double-tapped.
 * @param [event] The original event arguments for the tap. Setting its [TapEventArgs.handled] property to `true` will indicate that the double-tap was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-doubleTap">Online Documentation</a>
 */
 open protected   fun doubleTap( tableHitTestResult: TableHitTestResult ,
 event: TapEventArgs )
/**
 * Starts editing of the given label.
 * @param [label] The label to edit.
 * @return A Promise of the label that will be resolved with the label or a `null` if the text edit was canceled.
 * @see [onLabelTextEdited]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-editLabel">Online Documentation</a>
 */
 open   fun editLabel( label: ILabel ):Promise<ILabel?>
/**
 * Starts label editing by executing [ICommand.EDIT_LABEL].
 * @param [item] The item whose label or the label itself that should be edited upon the double click gesture.
 * @return `true` iff the request was handled.
 * @see [doubleClick]
 * @see [doubleTap]
 * @see [allowEditLabelOnDoubleClick]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-editLabelOnDoubleClick">Online Documentation</a>
 */
 open protected   fun editLabelOnDoubleClick( item: IModelItem ):Boolean
/**
 * Used as a callback to find the items underneath a certain point.
 * @param [location] The location to test.
 * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
 * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
 * @param [filter] Additional predicate to further restrict the hit test results.
 * @return The stripe subregions that have been found for the location or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-findStripe">Online Documentation</a>
 */
 open   fun findStripe( location: Point ,
 stripeTypes: StripeTypes ,
 subregionTypes: StripeSubregionTypes ,
 filter: Predicate<StripeSubregion>?  = definedExternally):StripeSubregion?
/**
 * Used as a callback to find the items underneath a certain point.
 * @param [location] The location to test.
 * @param [stripeTypes] An enumeration value of [StripeTypes] to specify the stripe type.
 * @param [subregionTypes] An enumeration value of [StripeSubregionTypes] to further restrict the stripe region.
 * @param [filter] Additional predicate to further restrict the hit test results.
 * @return The stripe subregions that have been found for the location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-findStripes">Online Documentation</a>
 */
 open   fun findStripes( location: Point ,
 stripeTypes: StripeTypes ,
 subregionTypes: StripeSubregionTypes ,
 filter: Predicate<StripeSubregion>?  = definedExternally):IEnumerable<StripeSubregion>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-initialize">Online Documentation</a>
 */
 override   fun initialize()
/**
 * Inserts a new stripe as child of `owner`
 * @param [owner] The parent of the new stripe.
 * @param [index] The index where to insert the new stripe.
 * @param [size] The initial size of the stripe
 * @return A new stripe at the given index unless `owner` is not associated with a [IStripe.table].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-insertChild">Online Documentation</a>
 */
 open   fun insertChild( owner: IStripe ,
 index: Int ,
 size: Double?  = definedExternally):IStripe?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Invoked if the shift+F2 key is pressed and [allowAddLabel] is set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onAddLabel">Online Documentation</a>
 */
 open protected   fun onAddLabel():Boolean
/**
 * Called when the [clickInputMode] property value changes and after initialization of the field.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeChanged">Online Documentation</a>
 */
 open protected   fun onClickInputModeChanged( oldMode: ClickInputMode? ,
 newMode: ClickInputMode )
/**
 * Called once [clickInputMode] triggers the [ClickInputMode.Clicked] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeClicked">Online Documentation</a>
 */
 open protected   fun onClickInputModeClicked( sender: IEventDispatcher ,
 event: ClickEventArgs )
/**
 * Called once [clickInputMode] triggers the [ClickInputMode.DoubleClicked] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onClickInputModeDoubleClicked">Online Documentation</a>
 */
 open protected   fun onClickInputModeDoubleClicked( sender: IEventDispatcher ,
 event: ClickEventArgs )
/**
 * Raises the [DeletedItem] event.
 * @param [event] The instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletedItem">Online Documentation</a>
 */
 final protected   fun onDeletedItem( event: ItemEventArgs<IModelItem> )
/**
 * Raises the [DeletedSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletedSelection">Online Documentation</a>
 */
 open protected   fun onDeletedSelection( event: SelectionEventArgs<IStripe> )
/**
 * Raises the [DeletingSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onDeletingSelection">Online Documentation</a>
 */
 open protected   fun onDeletingSelection( event: SelectionEventArgs<IStripe> )
/**
 * Invoked if the F2 key is pressed and [allowEditLabel] is set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onEditLabel">Online Documentation</a>
 */
 open protected   fun onEditLabel():Boolean
/**
 * Raises the [ItemClicked] event.
 * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemClicked">Online Documentation</a>
 */
 open protected   fun onItemClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemDoubleClicked] event.
 * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemDoubleClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemDoubleTapped] event.
 * @param [event] The [TableItemTappedEventArgs] instance that contains the item that has been double tapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemDoubleTapped">Online Documentation</a>
 */
 open protected   fun onItemDoubleTapped( event: TableItemTappedEventArgs<IModelItem> )
/**
 * Raises the [ItemLeftClicked] event.
 * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemLeftClicked">Online Documentation</a>
 */
 open protected   fun onItemLeftClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemLeftDoubleClicked] event.
 * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemLeftDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemLeftDoubleClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemRightClicked] event.
 * @param [event] The [ItemClickedEventArgs] instance that contains the item that has been clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemRightClicked">Online Documentation</a>
 */
 open protected   fun onItemRightClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemRightDoubleClicked] event.
 * @param [event] The [TableItemClickedEventArgs] instance that contains the item that has been double clicked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemRightDoubleClicked">Online Documentation</a>
 */
 open protected   fun onItemRightDoubleClicked( event: TableItemClickedEventArgs<IModelItem> )
/**
 * Raises the [ItemTapped] event.
 * @param [event] The [TableItemTappedEventArgs] instance that contains the item that has been tapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onItemTapped">Online Documentation</a>
 */
 open protected   fun onItemTapped( event: TableItemTappedEventArgs<IModelItem> )
/**
 * Called when the [keyboardInputMode] changed.
 * @param [oldMode] The old [keyboardInputMode].
 * @param [newMode] The new [keyboardInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onKeyboardInputModeChanged">Online Documentation</a>
 */
 open protected   fun onKeyboardInputModeChanged( oldMode: KeyboardInputMode? ,
 newMode: KeyboardInputMode )
/**
 * Raises the [LabelAdded] event.
 * @param [event] The [ItemEventArgs] instance that contains the [ILabel] that has been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( event: LabelEventArgs )
/**
 * Raises the [LabelAdding] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelAdding">Online Documentation</a>
 */
 open protected   fun onLabelAdding( event: LabelEditingEventArgs )
/**
 * Raises the [LabelEditing] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelEditing">Online Documentation</a>
 */
 open protected   fun onLabelEditing( event: LabelEditingEventArgs )
/**
 * Raises the [LabelTextChanged] event.
 * @param [event] The [ItemEventArgs] instance that contains the [ILabel] that has changed the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelTextChanged">Online Documentation</a>
 */
 open protected   fun onLabelTextChanged( event: ItemEventArgs<ILabel> )
/**
 * Called when the text of a label has been [edited][editLabel].
 * @param [label] The label that was edited.
 * @param [text] The new text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelTextEdited">Online Documentation</a>
 */
 open protected   fun onLabelTextEdited( label: ILabel ,
 text: String )
/**
 * Raises the [LabelTextEditingCanceled] event.
 * @param [event] The [LabelEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelTextEditingCanceled">Online Documentation</a>
 */
 open protected   fun onLabelTextEditingCanceled( event: LabelEventArgs )
/**
 * Raises the [LabelTextEditingStarted] event.
 * @param [event] The [LabelEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onLabelTextEditingStarted">Online Documentation</a>
 */
 open protected   fun onLabelTextEditingStarted( event: LabelEventArgs )
/**
 * Called when the [reparentStripeHandler] property value changes and after initialization of the field.
 * @param [oldHandler] the old value, which may be `null` the first time
 * @param [newHandler] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onReparentStripeHandlerChanged">Online Documentation</a>
 */
 open protected   fun onReparentStripeHandlerChanged( oldHandler: IReparentStripeHandler? ,
 newHandler: IReparentStripeHandler )
/**
 * Called when the [reparentStripeInputMode] property value changes and after initialization of the field.
 * @param [oldHandler] the old value, which may be `null` the first time
 * @param [newHandler] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onReparentStripeInputModeChanged">Online Documentation</a>
 */
 open protected   fun onReparentStripeInputModeChanged( oldHandler: ReparentStripeInputMode? ,
 newHandler: ReparentStripeInputMode )
/**
 * Called when the [resizeStripeInputMode] property value changes and after initialization of the field.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onResizeStripeInputModeChanged">Online Documentation</a>
 */
 open protected   fun onResizeStripeInputModeChanged( oldMode: ResizeStripeInputMode? ,
 newMode: ResizeStripeInputMode )
/**
 * Called when the [stripeDropInputMode] property value changes and after initialization of the field.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onStripeDropInputModeChanged">Online Documentation</a>
 */
 open protected   fun onStripeDropInputModeChanged( oldMode: StripeDropInputMode? ,
 newMode: StripeDropInputMode )
/**
 * Called when the [textEditorInputMode] property value changes and after initialization of the field.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onTextEditorInputModeChanged">Online Documentation</a>
 */
 open protected   fun onTextEditorInputModeChanged( oldMode: TextEditorInputMode? ,
 newMode: TextEditorInputMode )
/**
 * Raises the [ValidateLabelText] event.
 * @param [event] The [LabelTextValidatingEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-onValidateLabelText">Online Documentation</a>
 */
 open protected   fun onValidateLabelText( event: LabelTextValidatingEventArgs )
/**
 * Clears the current selection and selects all stripes in all table instances.
 * @see [ICommand.SELECT_ALL]
 * @see [selectableItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-selectAll">Online Documentation</a>
 */
 open   fun selectAll()
/**
 * Predicate that determines whether a label may be added interactively to `item`
 * @param [item] The item to query
 * @return `true` iff a label may be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldAddLabel">Online Documentation</a>
 */
 open protected   fun shouldAddLabel( item: IModelItem ):Boolean
/**
 * Called to determine whether the item described by `tableHitTestResult` can be [clicked][click].
 * @param [tableHitTestResult] Information about the item to check.
 * @return Whether the item should be [clicked][click] in response to a [detected mouse click][ClickInputMode.Clicked].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldClick">Online Documentation</a>
 */
 open protected   fun shouldClick( tableHitTestResult: TableHitTestResult ):Boolean
/**
 * Determines whether the given item should be deleted during [deleteSelection].
 * @param [stripe] The item.
 * @return Whether to delete that item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldDelete">Online Documentation</a>
 */
 open protected   fun shouldDelete( stripe: IStripe ):Boolean
/**
 * Called to determine whether the item described by `tableHitTestResult` can be [double clicked][doubleClick].
 * @param [tableHitTestResult] Information about the item to check.
 * @return Whether the item should be [double clicked][doubleClick] in response to a [detected double click][ClickInputMode.DoubleClicked].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldDoubleClick">Online Documentation</a>
 */
 open protected   fun shouldDoubleClick( tableHitTestResult: TableHitTestResult ):Boolean
/**
 * Determines whether the label or the labels of the provided item should be edited in response to a command or explicit method call to [editLabel] or [createLabel].
 * @param [item] The item.
 * @return Whether to edit the label or the labels for that item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldEditLabel">Online Documentation</a>
 */
 open protected   fun shouldEditLabel( item: IModelItem ):Boolean
/**
 * Called by [onKeyboardInputModeChanged] to determine which of the built-in [ICommand]s to install.
 * @param [command] The command to install.
 * @return Whether to install this command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-shouldInstallCommand">Online Documentation</a>
 */
 open protected   fun shouldInstallCommand( command: ICommand<*> ):Boolean
/**
 * Actually performs the tap on the given item.
 * @param [tableHitTestResult] Information about the item that has been tapped.
 * @param [event] The original event arguments for the tap. Setting its [TapEventArgs.handled] property to `true` will indicate that the tap was handled. By default this happens when the tapped item is either selected or focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-tap">Online Documentation</a>
 */
 open protected   fun tap( tableHitTestResult: TableHitTestResult ,
 event: TapEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23TableEditorInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when a label is about to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelAdding">Online Documentation</a>
 */
fun addLabelAddingListener(listener: EventHandler1<LabelEditingEventArgs>)
fun removeLabelAddingListener(listener: EventHandler1<LabelEditingEventArgs>)

/**
 * Occurs when a label is about to be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelEditing">Online Documentation</a>
 */
fun addLabelEditingListener(listener: EventHandler1<LabelEditingEventArgs>)
fun removeLabelEditingListener(listener: EventHandler1<LabelEditingEventArgs>)

/**
 * Occurs when this mode has triggered the addition of an [ILabel], for instance, in response to [createLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelAddedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs when this mode has triggered the edit of an [ILabel], for instance, in response to [editLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextChanged">Online Documentation</a>
 */
fun addLabelTextChangedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
fun removeLabelTextChangedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * Occurs when the actual label editing process is about to start.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextEditingStarted">Online Documentation</a>
 */
fun addLabelTextEditingStartedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
fun removeLabelTextEditingStartedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * Occurs when the actual label editing process is canceled.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextEditingCanceled">Online Documentation</a>
 */
fun addLabelTextEditingCanceledListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
fun removeLabelTextEditingCanceledListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * Occurs after label editing to validate the label text for a label that is about to be added or edited.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ValidateLabelText">Online Documentation</a>
 */
fun addValidateLabelTextListener(listener: EventHandler1<LabelTextValidatingEventArgs>)
fun removeValidateLabelTextListener(listener: EventHandler1<LabelTextValidatingEventArgs>)

/**
 * Occurs just before the [deleteSelection] method starts its work and will be followed by any number of [DeletedItem] events and finalized by a [DeletedSelection] event.
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletingSelection">Online Documentation</a>
 */
fun addDeletingSelectionListener(listener: EventHandler1<SelectionEventArgs<IStripe>>)
fun removeDeletingSelectionListener(listener: EventHandler1<SelectionEventArgs<IStripe>>)

/**
 * Occurs when an item has been deleted interactively by this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletedItem">Online Documentation</a>
 */
fun addDeletedItemListener(listener: EventHandler1<ItemEventArgs<IModelItem>>)
fun removeDeletedItemListener(listener: EventHandler1<ItemEventArgs<IModelItem>>)

/**
 * Occurs after all selected items have been removed in [deleteSelection].
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletedSelection">Online Documentation</a>
 */
fun addDeletedSelectionListener(listener: EventHandler1<SelectionEventArgs<IStripe>>)
fun removeDeletedSelectionListener(listener: EventHandler1<SelectionEventArgs<IStripe>>)

/**
 * Occurs when an item has been clicked or tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemClicked">Online Documentation</a>
 */
fun addItemClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been left clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemLeftClicked">Online Documentation</a>
 */
fun addItemLeftClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemLeftClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been right clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemTappedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemRightClicked">Online Documentation</a>
 */
fun addItemRightClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemRightClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemTapped">Online Documentation</a>
 */
fun addItemTappedListener(listener: EventHandler1<TableItemTappedEventArgs<IModelItem>>)
fun removeItemTappedListener(listener: EventHandler1<TableItemTappedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been double clicked.
 * @see [addItemClickedListener]
 * @see [clickableItems]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemDoubleClicked">Online Documentation</a>
 */
fun addItemDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been left double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemLeftDoubleClicked">Online Documentation</a>
 */
fun addItemLeftDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemLeftDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been right double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemRightDoubleClicked">Online Documentation</a>
 */
fun addItemRightDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)
fun removeItemRightDoubleClickedListener(listener: EventHandler1<TableItemClickedEventArgs<IModelItem>>)

/**
 * Occurs when an item has been double tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemDoubleTapped">Online Documentation</a>
 */
fun addItemDoubleTappedListener(listener: EventHandler1<TableItemTappedEventArgs<IModelItem>>)
fun removeItemDoubleTappedListener(listener: EventHandler1<TableItemTappedEventArgs<IModelItem>>)

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
 * Occurs when a label is about to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelAdding">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelAddingHandler(
    crossinline handler: (event:LabelEditingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEditingEventArgs> = { _, event -> handler(event) }
    addLabelAddingListener(listener)
    return { removeLabelAddingListener(listener) }
}
/**
 * Occurs when a label is about to be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelEditing">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelEditingHandler(
    crossinline handler: (event:LabelEditingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEditingEventArgs> = { _, event -> handler(event) }
    addLabelEditingListener(listener)
    return { removeLabelEditingListener(listener) }
}
/**
 * Occurs when this mode has triggered the addition of an [ILabel], for instance, in response to [createLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelAdded">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelAddedHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelAddedListener(listener)
    return { removeLabelAddedListener(listener) }
}
/**
 * Occurs when this mode has triggered the edit of an [ILabel], for instance, in response to [editLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextChanged">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelTextChangedHandler(
    crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<ILabel>> = { _, event -> handler(event.item) }
    addLabelTextChangedListener(listener)
    return { removeLabelTextChangedListener(listener) }
}
/**
 * Occurs when the actual label editing process is about to start.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextEditingStarted">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelTextEditingStartedHandler(
    crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<ILabel>> = { _, event -> handler(event.item) }
    addLabelTextEditingStartedListener(listener)
    return { removeLabelTextEditingStartedListener(listener) }
}
/**
 * Occurs when the actual label editing process is canceled.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23LabelTextEditingCanceled">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addLabelTextEditingCanceledHandler(
    crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<ILabel>> = { _, event -> handler(event.item) }
    addLabelTextEditingCanceledListener(listener)
    return { removeLabelTextEditingCanceledListener(listener) }
}
/**
 * Occurs after label editing to validate the label text for a label that is about to be added or edited.
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ValidateLabelText">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addValidateLabelTextHandler(
    crossinline handler: (event:LabelTextValidatingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelTextValidatingEventArgs> = { _, event -> handler(event) }
    addValidateLabelTextListener(listener)
    return { removeValidateLabelTextListener(listener) }
}
/**
 * Occurs just before the [deleteSelection] method starts its work and will be followed by any number of [DeletedItem] events and finalized by a [DeletedSelection] event.
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletingSelection">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletingSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IStripe>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IStripe>> = { _, event -> handler(event.context, event.selection) }
    addDeletingSelectionListener(listener)
    return { removeDeletingSelectionListener(listener) }
}
/**
 * Occurs when an item has been deleted interactively by this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletedItem">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletedItemHandler(
    crossinline handler: (item:IModelItem) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IModelItem>> = { _, event -> handler(event.item) }
    addDeletedItemListener(listener)
    return { removeDeletedItemListener(listener) }
}
/**
 * Occurs after all selected items have been removed in [deleteSelection].
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23DeletedSelection">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addDeletedSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IStripe>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IStripe>> = { _, event -> handler(event.context, event.selection) }
    addDeletedSelectionListener(listener)
    return { removeDeletedSelectionListener(listener) }
}
/**
 * Occurs when an item has been clicked or tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftClickedListener]
 * @see [addItemRightClickedListener]
 * @see [addItemTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemLeftClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemLeftClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemRightClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemRightClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemTapped">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemTappedHandler(
    crossinline handler: (event:TableItemTappedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemTappedEventArgs<IModelItem>> = { _, event -> handler(event) }
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemDoubleClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemDoubleClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemDoubleClickedListener(listener)
    return { removeItemDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been left double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemLeftDoubleClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemLeftDoubleClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemLeftDoubleClickedListener(listener)
    return { removeItemLeftDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been right double clicked.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemDoubleTappedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemRightDoubleClicked">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemRightDoubleClickedHandler(
    crossinline handler: (event:TableItemClickedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemClickedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemRightDoubleClickedListener(listener)
    return { removeItemRightDoubleClickedListener(listener) }
}
/**
 * Occurs when an item has been double tapped.
 * @see [clickableItems]
 * @see [addItemDoubleClickedListener]
 * @see [addItemLeftDoubleClickedListener]
 * @see [addItemRightDoubleClickedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableEditorInputMode%23ItemDoubleTapped">Online Documentation</a>
 */
inline fun  TableEditorInputMode.addItemDoubleTappedHandler(
    crossinline handler: (event:TableItemTappedEventArgs<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<TableItemTappedEventArgs<IModelItem>> = { _, event -> handler(event) }
    addItemDoubleTappedListener(listener)
    return { removeItemDoubleTappedListener(listener) }
}
