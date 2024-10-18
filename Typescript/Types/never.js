//type that contain no value
//you cannot assign any value to a var with a Never type
// we use Never on a func that returns an error
function raiseError(message) {
    throw new Error(message);
}
raiseError('bitch');
