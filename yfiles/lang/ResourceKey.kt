// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

        @JsName("String")
        external class ResourceKey<T:Any>
        private constructor()
        
        inline fun <T:Any> ResourceKey(source:String):ResourceKey<T> = 
            source.unsafeCast<ResourceKey<T>>()
        
        object ResourceKeys {
            /**
 * Default value - "Add Bend"
 */
inline val ADD_BEND__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddBend.RedoName")

/**
 * Default value - "Remove Bend"
 */
inline val ADD_BEND__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddBend.UndoName")

/**
 * Default value - "Add Label"
 */
inline val ADD_LABEL__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddLabel.RedoName")

/**
 * Default value - "Remove Label"
 */
inline val ADD_LABEL__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddLabel.UndoName")

/**
 * Default value - "Add Label"
 */
inline val ADD_LABEL: ResourceKey<String>
    get() = ResourceKey("AddLabel")

/**
 * Default hotkey - `Shift+F2`
 */
inline val ADD_LABEL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("AddLabelKey")

/**
 * Default value - "Add Port"
 */
inline val ADD_PORT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddPort.RedoName")

/**
 * Default value - "Remove Port"
 */
inline val ADD_PORT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AddPort.UndoName")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize.RedoName")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize.UndoName")

/**
 * Default value - "Adjust Group Node Size"
 */
inline val ADJUST_GROUP_NODE_SIZE: ResourceKey<String>
    get() = ResourceKey("AdjustGroupNodeSize")

/**
 * Default hotkey - `Ctrl+Shift+G`
 */
inline val ADJUST_GROUP_NODE_SIZE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("AdjustGroupNodeSizeKey")

/**
 * Default value - "Adjust Node Size"
 */
inline val ADJUST_TO_SIZE_CONSTRAINTS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustToSizeConstraints.RedoName")

/**
 * Default value - "Adjust Node Size"
 */
inline val ADJUST_TO_SIZE_CONSTRAINTS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("AdjustToSizeConstraints.UndoName")

/**
 * Default value - "Create Edge"
 */
inline val BEGIN_EDGE_CREATION: ResourceKey<String>
    get() = ResourceKey("BeginEdgeCreation")

/**
 * Default value - "Collapse Group"
 */
inline val COLLAPSE_GROUP: ResourceKey<String>
    get() = ResourceKey("CollapseGroup")

/**
 * Default hotkey - `Ctrl+Subtract`
 */
inline val COLLAPSE_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CollapseGroupKey")

/**
 * Default value - "Collapse Node"
 */
inline val COLLAPSE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CollapseNode.RedoName")

/**
 * Default value - "Expand Node"
 */
inline val COLLAPSE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CollapseNode.UndoName")

/**
 * Default value - "Copy"
 */
inline val COPY: ResourceKey<String>
    get() = ResourceKey("Copy")

/**
 * Default hotkey - `Ctrl+C`
 */
inline val COPY_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CopyKey")

/**
 * Default value - "Add Edge"
 */
inline val CREATE_EDGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateEdge.RedoName")

/**
 * Default value - "Remove Edge"
 */
inline val CREATE_EDGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateEdge.UndoName")

/**
 * Default value - "Add Node"
 */
inline val CREATE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateNode.RedoName")

/**
 * Default value - "Remove Node"
 */
inline val CREATE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateNode.UndoName")

/**
 * Default value - "CreateStripe"
 */
inline val CREATE_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateStripe.RedoName")

/**
 * Default value - "Add Stripe"
 */
inline val CREATE_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("CreateStripe.UndoName")

/**
 * Default value - "Redo Cut"
 */
inline val CUT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Cut.RedoName")

/**
 * Default value - "Undo Cut"
 */
inline val CUT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Cut.UndoName")

/**
 * Default value - "Cut"
 */
inline val CUT: ResourceKey<String>
    get() = ResourceKey("Cut")

/**
 * Default hotkey - `Ctrl+X`
 */
inline val CUT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("CutKey")

/**
 * Default value - "Zoom Out"
 */
inline val DECREASE_ZOOM: ResourceKey<String>
    get() = ResourceKey("DecreaseZoom")

/**
 * Default value - "Delete"
 */
inline val DELETE: ResourceKey<String>
    get() = ResourceKey("Delete")

/**
 * Default hotkey - `Delete`
 */
inline val DELETE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DeleteKey")

/**
 * Default value - "Redo Delete"
 */
inline val DELETE_SELECTION__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("DeleteSelection.RedoName")

/**
 * Default value - "Undo Delete"
 */
inline val DELETE_SELECTION__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("DeleteSelection.UndoName")

/**
 * Default value - "Deselect All"
 */
inline val DESELECT_ALL: ResourceKey<String>
    get() = ResourceKey("DeselectAll")

/**
 * Default hotkey - `Ctrl+D`
 */
inline val DESELECT_ALL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("DeselectAllKey")

/**
 * Default value - "Deselect Item"
 */
inline val DESELECT_ITEM: ResourceKey<String>
    get() = ResourceKey("DeselectItem")

/**
 * Default value - "Edit Label"
 */
inline val EDIT_LABEL: ResourceKey<String>
    get() = ResourceKey("EditLabel")

/**
 * Default hotkey - `F2`
 */
inline val EDIT_LABEL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("EditLabelKey")

/**
 * Default value - "Enter Group"
 */
inline val ENTER_GROUP: ResourceKey<String>
    get() = ResourceKey("EnterGroup")

/**
 * Default hotkey - `Ctrl+Enter`
 */
inline val ENTER_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("EnterGroupKey")

/**
 * Default value - "Exit Group"
 */
inline val EXIT_GROUP: ResourceKey<String>
    get() = ResourceKey("ExitGroup")

/**
 * Default hotkey - `Ctrl+Backspace`
 */
inline val EXIT_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExitGroupKey")

/**
 * Default value - "Expand Group"
 */
inline val EXPAND_GROUP: ResourceKey<String>
    get() = ResourceKey("ExpandGroup")

/**
 * Default hotkey - `Ctrl+Add`
 */
inline val EXPAND_GROUP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExpandGroupKey")

/**
 * Default value - "Expand Node"
 */
inline val EXPAND_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ExpandNode.RedoName")

/**
 * Default value - "Collapse Node"
 */
inline val EXPAND_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ExpandNode.UndoName")

/**
 * Default value - "Extend Selection Down"
 */
inline val EXTEND_SELECTION_DOWN: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionDown")

/**
 * Default hotkey - `Shift+Down`
 */
inline val EXTEND_SELECTION_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionDownKey")

/**
 * Default value - "Extend Selection Left"
 */
inline val EXTEND_SELECTION_LEFT: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionLeft")

/**
 * Default hotkey - `Shift+Left`
 */
inline val EXTEND_SELECTION_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionLeftKey")

/**
 * Default value - "Extend Selection Right"
 */
inline val EXTEND_SELECTION_RIGHT: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionRight")

/**
 * Default hotkey - `Shift+Right`
 */
inline val EXTEND_SELECTION_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionRightKey")

/**
 * Default value - "Extend Selection Up"
 */
inline val EXTEND_SELECTION_UP: ResourceKey<String>
    get() = ResourceKey("ExtendSelectionUp")

/**
 * Default hotkey - `Shift+Up`
 */
inline val EXTEND_SELECTION_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ExtendSelectionUpKey")

/**
 * Default value - "Fit Content"
 */
inline val FIT_CONTENT: ResourceKey<String>
    get() = ResourceKey("FitContent")

/**
 * Default value - "Fit Graph Bounds"
 */
inline val FIT_GRAPH_BOUNDS: ResourceKey<String>
    get() = ResourceKey("FitGraphBounds")

/**
 * Default value - "Group Selection"
 */
inline val GROUP_SELECTION: ResourceKey<String>
    get() = ResourceKey("GroupSelection")

/**
 * Default hotkey - `Ctrl+G`
 */
inline val GROUP_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("GroupSelectionKey")

/**
 * Default value - "Zoom In"
 */
inline val INCREASE_ZOOM: ResourceKey<String>
    get() = ResourceKey("IncreaseZoom")

/**
 * Default value - "Move Items"
 */
inline val MOVE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Move.RedoName")

/**
 * Default value - "Move Items"
 */
inline val MOVE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Move.UndoName")

/**
 * Default value - "Move Down"
 */
inline val MOVE_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveDown")

/**
 * Default hotkey - `Down`
 */
inline val MOVE_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveDownKey")

/**
 * Default value - "Move Focus Backward"
 */
inline val MOVE_FOCUS_BACK: ResourceKey<String>
    get() = ResourceKey("MoveFocusBack")

/**
 * Default hotkey - `Ctrl+Left`
 */
inline val MOVE_FOCUS_BACK_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusBackKey")

/**
 * Default value - "Move Focus Down"
 */
inline val MOVE_FOCUS_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveFocusDown")

/**
 * Default hotkey - `Ctrl+Down`
 */
inline val MOVE_FOCUS_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusDownKey")

/**
 * Default value - "Move Focus Forward"
 */
inline val MOVE_FOCUS_FORWARD: ResourceKey<String>
    get() = ResourceKey("MoveFocusForward")

/**
 * Default hotkey - `Ctrl+Right`
 */
inline val MOVE_FOCUS_FORWARD_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusForwardKey")

/**
 * Default value - "Move Focus Up"
 */
inline val MOVE_FOCUS_UP: ResourceKey<String>
    get() = ResourceKey("MoveFocusUp")

/**
 * Default hotkey - `Ctrl+Up`
 */
inline val MOVE_FOCUS_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveFocusUpKey")

/**
 * Default value - "Move Handle"
 */
inline val MOVE_HANDLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("MoveHandle.RedoName")

/**
 * Default value - "Move Handle"
 */
inline val MOVE_HANDLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("MoveHandle.UndoName")

/**
 * Default value - "Move Left"
 */
inline val MOVE_LEFT: ResourceKey<String>
    get() = ResourceKey("MoveLeft")

/**
 * Default hotkey - `Left`
 */
inline val MOVE_LEFT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveLeftKey")

/**
 * Default value - "Move Right"
 */
inline val MOVE_RIGHT: ResourceKey<String>
    get() = ResourceKey("MoveRight")

/**
 * Default hotkey - `Right`
 */
inline val MOVE_RIGHT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveRightKey")

/**
 * Default value - "Move Page Down"
 */
inline val MOVE_TO_PAGE_DOWN: ResourceKey<String>
    get() = ResourceKey("MoveToPageDown")

/**
 * Default hotkey - `PageDown`
 */
inline val MOVE_TO_PAGE_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveToPageDownKey")

/**
 * Default value - "Move Page Up"
 */
inline val MOVE_TO_PAGE_UP: ResourceKey<String>
    get() = ResourceKey("MoveToPageUp")

/**
 * Default hotkey - `PageUp`
 */
inline val MOVE_TO_PAGE_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveToPageUpKey")

/**
 * Default value - "Move Up"
 */
inline val MOVE_UP: ResourceKey<String>
    get() = ResourceKey("MoveUp")

/**
 * Default hotkey - `Up`
 */
inline val MOVE_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("MoveUpKey")

/**
 * Default value - "New"
 */
inline val NEW: ResourceKey<String>
    get() = ResourceKey("New")

/**
 * Default hotkey - `Ctrl+N`
 */
inline val NEW_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("NewKey")

/**
 * Default value - "Add Node"
 */
inline val NODE_DROP_INPUT_MODE__NODE_DROPPED__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("NodeDropInputMode.NodeDropped.RedoName")

/**
 * Default value - "Remove Node"
 */
inline val NODE_DROP_INPUT_MODE__NODE_DROPPED__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("NodeDropInputMode.NodeDropped.UndoName")

/**
 * Default value - "Open"
 */
inline val OPEN: ResourceKey<String>
    get() = ResourceKey("Open")

/**
 * Default value - "Error Loading File"
 */
inline val OPEN_FILE_FAILED__CAPTION: ResourceKey<String>
    get() = ResourceKey("OpenFileFailed.Caption")

/**
 * Default value - "There was a problem during the loading of the file."
 */
inline val OPEN_FILE_FAILED__MESSAGE: ResourceKey<String>
    get() = ResourceKey("OpenFileFailed.Message")

/**
 * Default value - "Redo Paste"
 */
inline val PASTE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("Paste.RedoName")

/**
 * Default value - "Undo Paste"
 */
inline val PASTE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("Paste.UndoName")

/**
 * Default value - "Paste"
 */
inline val PASTE: ResourceKey<String>
    get() = ResourceKey("Paste")

/**
 * Default hotkey - `Ctrl+V`
 */
inline val PASTE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("PasteKey")

/**
 * Default value - "Print"
 */
inline val PRINT: ResourceKey<String>
    get() = ResourceKey("Print")

/**
 * Default hotkey - `Ctrl+P`
 */
inline val PRINT_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("PrintKey")

/**
 * Default value - "PrintPreview"
 */
inline val PRINT_PREVIEW: ResourceKey<String>
    get() = ResourceKey("PrintPreview")

/**
 * Default hotkey - `Ctrl+F2`
 */
inline val PRINT_PREVIEW_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("PrintPreviewKey")

/**
 * Default value - "Redo"
 */
inline val REDO: ResourceKey<String>
    get() = ResourceKey("Redo")

/**
 * Default hotkey - `Ctrl+Y`
 */
inline val REDO_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("RedoKey")

/**
 * Default value - "Remove Bend"
 */
inline val REMOVE_BEND__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveBend.RedoName")

/**
 * Default value - "Add Bend"
 */
inline val REMOVE_BEND__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveBend.UndoName")

/**
 * Default value - "Remove Edge"
 */
inline val REMOVE_EDGE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveEdge.RedoName")

/**
 * Default value - "Add Edge"
 */
inline val REMOVE_EDGE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveEdge.UndoName")

/**
 * Default value - "Remove Label"
 */
inline val REMOVE_LABEL__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveLabel.RedoName")

/**
 * Default value - "Add Label"
 */
inline val REMOVE_LABEL__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveLabel.UndoName")

/**
 * Default value - "Remove Node"
 */
inline val REMOVE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveNode.RedoName")

/**
 * Default value - "Add Node"
 */
inline val REMOVE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveNode.UndoName")

/**
 * Default value - "Remove Port"
 */
inline val REMOVE_PORT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemovePort.RedoName")

/**
 * Default value - "Add Port"
 */
inline val REMOVE_PORT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemovePort.UndoName")

/**
 * Default value - "Add Stripe"
 */
inline val REMOVE_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveStripe.RedoName")

/**
 * Default value - "Remove Stripe"
 */
inline val REMOVE_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("RemoveStripe.UndoName")

/**
 * Default value - "Reparent Stripe"
 */
inline val REPARENT_STRIPE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReparentStripe.RedoName")

/**
 * Default value - "Reparent Stripe"
 */
inline val REPARENT_STRIPE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ReparentStripe.UndoName")

/**
 * Default value - "Resize Node"
 */
inline val RESIZE_NODE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("ResizeNode.RedoName")

/**
 * Default value - "Resize Node"
 */
inline val RESIZE_NODE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("ResizeNode.UndoName")

/**
 * Default value - "Save"
 */
inline val SAVE: ResourceKey<String>
    get() = ResourceKey("Save")

/**
 * Default value - "Save As…​"
 */
inline val SAVE_AS: ResourceKey<String>
    get() = ResourceKey("SaveAs")

/**
 * Default value - "Error Saving File"
 */
inline val SAVE_FILE_FAILED__CAPTION: ResourceKey<String>
    get() = ResourceKey("SaveFileFailed.Caption")

/**
 * Default value - "There was a problem during the saving of the file."
 */
inline val SAVE_FILE_FAILED__MESSAGE: ResourceKey<String>
    get() = ResourceKey("SaveFileFailed.Message")

/**
 * Default value - "Scroll Page Down"
 */
inline val SCROLL_PAGE_DOWN: ResourceKey<String>
    get() = ResourceKey("ScrollPageDown")

/**
 * Default hotkey - `PageDown`
 */
inline val SCROLL_PAGE_DOWN_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageDownKey")

/**
 * Default value - "Scroll Page Left"
 */
inline val SCROLL_PAGE_LEFT: ResourceKey<String>
    get() = ResourceKey("ScrollPageLeft")

/**
 * Default value - "Scroll Page Right"
 */
inline val SCROLL_PAGE_RIGHT: ResourceKey<String>
    get() = ResourceKey("ScrollPageRight")

/**
 * Default value - "Scroll Page Up"
 */
inline val SCROLL_PAGE_UP: ResourceKey<String>
    get() = ResourceKey("ScrollPageUp")

/**
 * Default hotkey - `PageUp`
 */
inline val SCROLL_PAGE_UP_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ScrollPageUpKey")

/**
 * Default value - "Select All"
 */
inline val SELECT_ALL: ResourceKey<String>
    get() = ResourceKey("SelectAll")

/**
 * Default hotkey - `Ctrl+A`
 */
inline val SELECT_ALL_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("SelectAllKey")

/**
 * Default value - "Select Item"
 */
inline val SELECT_ITEM: ResourceKey<String>
    get() = ResourceKey("SelectItem")

/**
 * Default value - "Set Current Item"
 */
inline val SET_CURRENT_ITEM: ResourceKey<String>
    get() = ResourceKey("SetCurrentItem")

/**
 * Default value - "Change Edge Style"
 */
inline val SET_EDGE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgeStyle.RedoName")

/**
 * Default value - "Change Edge Style"
 */
inline val SET_EDGE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetEdgeStyle.UndoName")

/**
 * Default value - "Change Label Position"
 */
inline val SET_LABEL_MODEL_PARAMETER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelModelParameter.RedoName")

/**
 * Default value - "Change Label Position"
 */
inline val SET_LABEL_MODEL_PARAMETER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelModelParameter.UndoName")

/**
 * Default value - "Change Label Style"
 */
inline val SET_LABEL_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelStyle.RedoName")

/**
 * Default value - "Change Label Style"
 */
inline val SET_LABEL_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelStyle.UndoName")

/**
 * Default value - "Change Label Text"
 */
inline val SET_LABEL_TEXT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelText.RedoName")

/**
 * Default value - "Change Label Text"
 */
inline val SET_LABEL_TEXT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLabelText.UndoName")

/**
 * Default value - "Convert Back to Group Node"
 */
inline val SET_LEAF__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLeaf.RedoName")

/**
 * Default value - "Convert to Normal Node"
 */
inline val SET_LEAF__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLeaf.UndoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_LOCATION_MODEL_PARAMETER__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLocationModelParameter.RedoName")

/**
 * Default value - "Change Port Location"
 */
inline val SET_LOCATION_MODEL_PARAMETER__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetLocationModelParameter.UndoName")

/**
 * Default value - "Change Node Style"
 */
inline val SET_NODE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNodeStyle.RedoName")

/**
 * Default value - "Change Node Style"
 */
inline val SET_NODE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNodeStyle.UndoName")

/**
 * Default value - "Convert Back to Normal Node"
 */
inline val SET_NON_LEAF__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNonLeaf.RedoName")

/**
 * Default value - "Convert to Group Node"
 */
inline val SET_NON_LEAF__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetNonLeaf.UndoName")

/**
 * Default value - "Change Parent"
 */
inline val SET_PARENT__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetParent.RedoName")

/**
 * Default value - "Change Parent"
 */
inline val SET_PARENT__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetParent.UndoName")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_PORTS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPorts.RedoName")

/**
 * Default value - "Reconnect Edge"
 */
inline val SET_PORTS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPorts.UndoName")

/**
 * Default value - "Change Port Style"
 */
inline val SET_PORT_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortStyle.RedoName")

/**
 * Default value - "Change Port Style"
 */
inline val SET_PORT_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPortStyle.UndoName")

/**
 * Default value - "Change Preferred Label Size"
 */
inline val SET_PREFERRED_LABEL_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPreferredLabelSize.RedoName")

/**
 * Default value - "Change Preferred Label Size"
 */
inline val SET_PREFERRED_LABEL_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetPreferredLabelSize.UndoName")

/**
 * Default value - "Change Stripe Insets"
 */
inline val SET_STRIPE_INSETS__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeInsets.RedoName")

/**
 * Default value - "Change Stripe Insets"
 */
inline val SET_STRIPE_INSETS__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeInsets.UndoName")

/**
 * Default value - "Change Minimum Stripe Size"
 */
inline val SET_STRIPE_MINIMUM_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeMinimumSize.RedoName")

/**
 * Default value - "Change Minimum Stripe Size"
 */
inline val SET_STRIPE_MINIMUM_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeMinimumSize.UndoName")

/**
 * Default value - "Change Stripe Size"
 */
inline val SET_STRIPE_SIZE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeSize.RedoName")

/**
 * Default value - "Change Stripe Size"
 */
inline val SET_STRIPE_SIZE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeSize.UndoName")

/**
 * Default value - "Change Stripe Style"
 */
inline val SET_STRIPE_STYLE__REDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeStyle.RedoName")

/**
 * Default value - "Change Stripe Style"
 */
inline val SET_STRIPE_STYLE__UNDO_NAME: ResourceKey<String>
    get() = ResourceKey("SetStripeStyle.UndoName")

/**
 * Default value - "Toggle Group State"
 */
inline val TOGGLE_EXPANSION_STATE: ResourceKey<String>
    get() = ResourceKey("ToggleExpansionState")

/**
 * Default hotkey - `Ctrl+Multiply`
 */
inline val TOGGLE_EXPANSION_STATE_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ToggleExpansionStateKey")

/**
 * Default value - "Toggle Selection"
 */
inline val TOGGLE_ITEM_SELECTION: ResourceKey<String>
    get() = ResourceKey("ToggleItemSelection")

/**
 * Default hotkey - `Ctrl+Space`
 */
inline val TOGGLE_ITEM_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("ToggleItemSelectionKey")

/**
 * Default value - "Unavailable"
 */
inline val UNAVAILABLE: ResourceKey<String>
    get() = ResourceKey("Unavailable")

/**
 * Default value - "Undo"
 */
inline val UNDO: ResourceKey<String>
    get() = ResourceKey("Undo")

/**
 * Default hotkey - `Ctrl+Z`
 */
inline val UNDO_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("UndoKey")

/**
 * Default value - "Ungroup Selection"
 */
inline val UNGROUP_SELECTION: ResourceKey<String>
    get() = ResourceKey("UngroupSelection")

/**
 * Default hotkey - `Ctrl+U`
 */
inline val UNGROUP_SELECTION_KEY: ResourceKey<Hotkey>
    get() = ResourceKey("UngroupSelectionKey")

/**
 * Default value - "Update Content Rectangle"
 */
inline val UPDATE_CONTENT_RECT: ResourceKey<String>
    get() = ResourceKey("UpdateContentRect")

/**
 * Default value - "Zoom"
 */
inline val ZOOM: ResourceKey<String>
    get() = ResourceKey("Zoom")

/**
 * Default value - "Zoom To Current Item"
 */
inline val ZOOM_TO_CURRENT_ITEM: ResourceKey<String>
    get() = ResourceKey("ZoomToCurrentItem")

        }
