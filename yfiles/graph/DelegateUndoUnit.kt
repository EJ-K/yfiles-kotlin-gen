// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * An implementation of the [IUndoUnit] interface that uses delegates for the actual [undo] and [redo] operations.
 * @param [T] The type of the single parameter that is passed to the delegate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegateUndoUnit">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided name and a undo/redo handler as well as the parameters to pass to the delegates.
 * @param [undoName] The name of the undo.
 * @param [undoRedo] The undo and redo handler delegate.
 * @param [undoParam] The undo parameter to pass to the delegate.
 * @param [redoParam] The redo parameter to pass to the delegate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegateUndoUnit%23DelegateUndoUnit-constructor-DelegateUndoUnit(string,DoHandlerDelegate,T,T)">Online Documentation</a>
 */
external  class DelegateUndoUnit<T : Any>  ( undoName: String ,
 undoRedo: DoHandlerDelegate<T> ,
 undoParam: T? ,
 redoParam: T? ) : UndoUnitBase {
/**
 * Creates a new instance using the provided name and a undo and redo handler as well as the parameters to pass to the delegates.
 * @param [undoName] The name of the undo.
 * @param [undo] The undo handler delegate.
 * @param [redo] The redo handler delegate.
 * @param [undoParam] The undo parameter to pass to the delegate.
 * @param [redoParam] The redo parameter to pass to the delegate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegateUndoUnit%23DelegateUndoUnit-constructor-DelegateUndoUnit(string,DoHandlerDelegate,DoHandlerDelegate,T,T)">Online Documentation</a>
 */
 constructor( undoName: String ,
 undo: DoHandlerDelegate<T> ,
 redo: DoHandlerDelegate<T> ,
 undoParam: T? ,
 redoParam: T? )

/**
 * Calls the redo delegate using the redo parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegateUndoUnit%23DelegateUndoUnit-method-redo">Online Documentation</a>
 */
 final override   fun redo()
/**
 * Calls the undo delegate using the undo parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegateUndoUnit%23DelegateUndoUnit-method-undo">Online Documentation</a>
 */
 final override   fun undo()

companion object : ClassMetadata<DelegateUndoUnit<*>> {
}
}
