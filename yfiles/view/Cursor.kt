// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a cursor object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor">Online Documentation</a>
 * 
 * @constructor Initializes a new [Cursor] instance using the provided url and an alternative.
 * @param [url] The url should point to a file in the ".cur" format with a size of at most 32x32 pixels to ensure compatibility across browsers.
 * @param [alternative] Cursors can be chained but the last alternative needs to be one of the predefined cursors.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23Cursor-constructor-Cursor">Online Documentation</a>
 */
external open class Cursor  ( url: String ,
 alternative: Cursor ) : YObject {

/**
 * Returns the CSS text representation for the cursor and its alternatives.
 * @return The CSS text representation for the cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23Cursor-method-getSystemCursor">Online Documentation</a>
 */
 final   fun getSystemCursor():String

companion object : ClassMetadata<Cursor> {
/**
 * Gets the cursor to be shown when an alias or shortcut can be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23ALIAS">Online Documentation</a>
 */
 val ALIAS: Cursor
/**
 * Gets the cursor indicating that something can be scrolled or panned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23ALL_SCROLL">Online Documentation</a>
 */
 val ALL_SCROLL: Cursor
/**
 * Gets the cursor where the browser determines the actual cursor to be displayed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23AUTO">Online Documentation</a>
 */
 val AUTO: Cursor
/**
 * Gets the cursor to indicate selection of a table cell..
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23CELL">Online Documentation</a>
 */
 val CELL: Cursor
/**
 * Gets the cursor for resizing columns.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23COL_RESIZE">Online Documentation</a>
 */
 val COL_RESIZE: Cursor
/**
 * Gets the cursor to indicate that there is a context menu available.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23CONTEXT_MENU">Online Documentation</a>
 */
 val CONTEXT_MENU: Cursor
/**
 * Gets the cursor to be shown when something can be copied (often used for drag &amp; drop).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23COPY">Online Documentation</a>
 */
 val COPY: Cursor
/**
 * Gets the crosshair cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23CROSSHAIR">Online Documentation</a>
 */
 val CROSSHAIR: Cursor
/**
 * Gets the default cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23DEFAULT">Online Documentation</a>
 */
 val DEFAULT: Cursor
/**
 * Gets the horizontal resize cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23EW_RESIZE">Online Documentation</a>
 */
 val EW_RESIZE: Cursor
/**
 * Gets a cursor that indicates that an edge at the east will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23E_RESIZE">Online Documentation</a>
 */
 val E_RESIZE: Cursor
/**
 * Gets the cursor indicating that something can be grabbed (usually in conjunction with [GRABBING]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23GRAB">Online Documentation</a>
 */
 val GRAB: Cursor
/**
 * Gets the cursor indicating that something is currently being grabbed (usually in conjunction with [GRAB]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23GRABBING">Online Documentation</a>
 */
 val GRABBING: Cursor
/**
 * Gets the cursor that indicates that help is available for the object under the cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23HELP">Online Documentation</a>
 */
 val HELP: Cursor
/**
 * Gets the move cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23MOVE">Online Documentation</a>
 */
 val MOVE: Cursor
/**
 * Gets the diagonal resize cursor for NE to SW resizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NESW_RESIZE">Online Documentation</a>
 */
 val NESW_RESIZE: Cursor
/**
 * Gets a cursor that indicates that edges at the north and east will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NE_RESIZE">Online Documentation</a>
 */
 val NE_RESIZE: Cursor
/**
 * Gets the invisible cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NONE">Online Documentation</a>
 */
 val NONE: Cursor
/**
 * Gets the cursor to be shown when an action cannot be done.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NOT_ALLOWED">Online Documentation</a>
 */
 val NOT_ALLOWED: Cursor
/**
 * Gets the cursor to be shown where nothing can be dropped in a drag &amp; drop operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NO_DROP">Online Documentation</a>
 */
 val NO_DROP: Cursor
/**
 * Gets the vertical resize cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NS_RESIZE">Online Documentation</a>
 */
 val NS_RESIZE: Cursor
/**
 * Gets the diagonal resize cursor for NW to SE resizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NWSE_RESIZE">Online Documentation</a>
 */
 val NWSE_RESIZE: Cursor
/**
 * Gets a cursor that indicates that edges at the north and west will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23NW_RESIZE">Online Documentation</a>
 */
 val NW_RESIZE: Cursor
/**
 * Gets a cursor that indicates that an edge at the north will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23N_RESIZE">Online Documentation</a>
 */
 val N_RESIZE: Cursor
/**
 * Gets the cursor with a pointing hand, as used for example on a hyperlink.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23POINTER">Online Documentation</a>
 */
 val POINTER: Cursor
/**
 * Gets the cursor that indicates progress.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23PROGRESS">Online Documentation</a>
 */
 val PROGRESS: Cursor
/**
 * Gets the cursor for resizing rows.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23ROW_RESIZE">Online Documentation</a>
 */
 val ROW_RESIZE: Cursor
/**
 * Gets a cursor that indicates that edges at the south and east will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23SE_RESIZE">Online Documentation</a>
 */
 val SE_RESIZE: Cursor
/**
 * Gets a cursor that indicates that edges at the south and west will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23SW_RESIZE">Online Documentation</a>
 */
 val SW_RESIZE: Cursor
/**
 * Gets a cursor that indicates that the edge at the south will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23S_RESIZE">Online Documentation</a>
 */
 val S_RESIZE: Cursor
/**
 * Gets the text selection cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23TEXT">Online Documentation</a>
 */
 val TEXT: Cursor
/**
 * Gets the vertical text selection cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23VERTICAL_TEXT">Online Documentation</a>
 */
 val VERTICAL_TEXT: Cursor
/**
 * Gets the wait cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23WAIT">Online Documentation</a>
 */
 val WAIT: Cursor
/**
 * Gets a cursor that indicates that the edge at the west will be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23W_RESIZE">Online Documentation</a>
 */
 val W_RESIZE: Cursor
/**
 * Gets the cursor for zooming in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23ZOOM_IN">Online Documentation</a>
 */
 val ZOOM_IN: Cursor
/**
 * Gets the cursor for zooming out.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursor%23ZOOM_OUT">Online Documentation</a>
 */
 val ZOOM_OUT: Cursor
}
}
